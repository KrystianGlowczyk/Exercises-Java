package Set1;

/*Wczytać od użytkownika 3 liczby całkowite 
 * i wypisać na ekran największą oraz najmniejszą z nich.
 */

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
			int[] tab = new int[3];

			System.out.println("Podaj pierwsza cyfre: ");
			tab[0] = scanner.nextInt();

			System.out.println("\nPodaj druga cyfre: ");
			tab[1] = scanner.nextInt();

			System.out.println("\nPodaj trzecia cyfre: ");
			tab[2] = scanner.nextInt();

			max(tab);
		}

	

	static void max(int[] tab) {

		int temp;

		for (int i = 0; i < tab.length - 1; i++) {
			for (int j = 0; j < tab.length - 1; j++) {
				if (tab[j] > tab[j + 1]) {
					temp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = temp;
				}
			}
		}
		System.out.println("Tablica posortowana: ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + ", ");
		}

	}

}
