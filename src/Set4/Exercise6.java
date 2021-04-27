package Set4;

/*Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy uży- ciu szyfru Cezara, 
który jest szczególnym przypadkiem szyfru podstawieniowego monoalfabetycznego.
Użytkownik program podaje tekst do zaszyfrowania oraz liczbę n, 
o którą prze- sunięty jest alfabet za pomocą którego szyfrujemy tekst. 
Dla uproszczenia można przyjąć, że łańuch wejściowy składa się tylko 
z małych liter alfabetu angielskiego, tj. ’a’ – ’z’ (26 znaków) oraz spacji.*/

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj tekst do zaszyfrowania: ");
		String text = scanner.nextLine();

		System.out.println("Podaj przesuiecie: ");
		int shift = scanner.nextInt();

		char[] encrypted = new char[text.length()];

		char[] tab = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't',
				'u', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < text.length(); i++) {

			char tmp = text.charAt(i);

			if (tmp == ' ') {
				encrypted[i] = tmp;
				System.out.print(encrypted[i]);
			}

			for (int j = 0; j < tab.length; j++) {

				if (tmp == tab[j]) {

					int k = j + shift;

					if (k >= tab.length) {
						k = k - tab.length;
						encrypted[i] = tab[k];
						System.out.print(encrypted[i]);
					} else {
						encrypted[i] = tab[j + shift];
						System.out.print(encrypted[i]);
					}
				}

			}
		}

	}

}
