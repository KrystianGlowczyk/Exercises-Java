package Set7.Exercise2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class List {
    private int[] numbers;
    private int maxSize;
    private int size;

    public List(int maxSize) {
        this.maxSize = maxSize;
        numbers = new int[maxSize];
        size = 0;
    }

    public void addItem(int x) {
        if (size < maxSize) {
            numbers[size] = x;
            size++;
        } else {
            System.out.println("\nLista jest pelna!");
        }
    }

    public int findNumber(int x) {
        int tmp = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                tmp = i;
                break;
            } else {
                tmp = -1;
            }
        }
        return tmp;
    }

    public void print() {
        System.out.println("\nLista:");
        System.out.println("\tPojemnosc: " + maxSize);
        System.out.println("\tRozmiar: " + size);
        System.out.print("\tElementy:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + numbers[i]);
        }
    }

    public void deleteFirst(int x) {
        int iter = 0;
        int[] tmp = new int[maxSize];
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                for (int j = 0; j < size; j++) {
                    if (j != i) {
                        tmp[iter] = numbers[j];
                        iter++;
                    }
                }
                size--;
                break;
            }
        }
        numbers = tmp;
    }

    public void removeReptitions() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    for (int k = j; k < size - 1; k++) {
                        numbers[k] = numbers[k + 1];
                    }
                    size--;
                    j--;
                }
            }
        }
        int[] tab2 = new int[maxSize];
        for (int i = 0; i < size; i++) {
            tab2[i] = numbers[i];
        }
        numbers = tab2;
    }

    public void saveToFile(String name){
        PrintWriter file = null;

        try{
            file = new PrintWriter(new FileWriter(name));
            file.print("Elementy:");
            for (int i=0;i<size;i++){
                file.format(" %d",numbers[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(file!=null){
                file.close();
            }
        }
    }



}
