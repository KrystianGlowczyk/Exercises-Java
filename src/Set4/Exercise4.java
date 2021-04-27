package Set4;

/*Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
Przykład: "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
Wynik: 6 */

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj ciag znakow: ");
		String str = scanner.nextLine();
		int[] tab = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int tmp;
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			tmp = Character.getNumericValue(str.charAt(i));

			for (int j = 0; j < tab.length; j++) {

				if (tmp == tab[j]) {
					sum += tmp;
				}
			}
		}

		System.out.println("SUMA CYFR: " + sum);

	}

}
