package Set3;

/*Napisać program, który wczytuje od użytkownika liczbę całkowitą, 
a następnie wyświetla jej reprezentację w kodzie binarnym (ZM). 
Podczas konwersji liczby należy kolejne jej bity zapisywać w pomocniczej tablicy liczb całk. o rozmiarze 32. 
Konwersji należy dokonać korzystając z operacji dzielenia całkowitego oraz operacji modulo.*/

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int numer = scanner.nextInt();
		int[] tab = new int[32];
		int x;

		int count = 0;

		for (int i = 0; i < tab.length; i++) {
			x = numer % 2;
			if (x > 0) {
				tab[i] = 1;
				count++;
			} else if (x == 0) {
				tab[i] = 0;
				count++;
			}
			numer = numer / 2;

			if (numer == 0) {
				break;
			}
		}
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(tab[i]);
		}
	}

}
