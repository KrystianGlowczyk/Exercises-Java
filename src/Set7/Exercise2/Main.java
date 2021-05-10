package Set7.Exercise2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        final int N = 10;
        List l = new List(N);
        for (int i = 0; i < N / 2; ++i) {
            l.addItem(1 << i);
        }
        l.addItem(2);
        l.addItem(8);
        l.print();
        l.deleteFirst(2);
        l.print();
        for (int i = 0; i < N / 2; ++i) {
            l.addItem((1 << i));
        }
        l.print();
        System.out.println("\nPo usunięciu powtórzeń:");
        l.removeReptitions();
        l.print();
        l.saveToFile("/Users/krystek/Desktop/plik55.txt");


    }


}
