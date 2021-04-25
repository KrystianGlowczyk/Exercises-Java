package Set1;
/*Napisać program realizujący funkcje prostego kalkulatora, 
pozwalającego na wy- konywanie operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch licz- bach rzeczywistych. Program ma identyfikować sytuację wprowadzenia błędnego symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu operacji. Scenariusz działania programu:
a) Program wyświetla informację o swoim przeznaczeniu.
b) Wczytuje pierwszą liczbę.
c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
d) Wczytuje drugą liczbę.
e) Wyświetla calculate lub - w razie konieczności - informację o niemożności wy- konania działania.
f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza 5.*/

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int number_1 = 0, number_2 = 0;
		char sign = ' ';

		System.out.println();
		System.out.println("     ****************************************");
		System.out.println("     *                 MENU                 *");
		System.out.println("     ****************************************");
		System.out.println("     1. Podaj pierwsza liczbe");
		System.out.println("     2. Podaj symbol operacji arytmetycznej: +, -, *, /");
		System.out.println("     3. Podaj druga liczbe");
		System.out.println("     4. Wynik");
		System.out.println("     5. Exit");

		while (x != 5) {
			System.out.println("Wybierz liczbe: 1-5");
			x = scanner.nextInt();

			switch (x) {
			case 1:
				System.out.println("Podaj pierwsza liczbe:");
				number_1 = scanner.nextInt();
				break;
			case 2:
				System.out.println("Podaj symbol operacji: ");
				sign = scanner.next().charAt(0);
				break;
			case 3:
				System.out.println("Podaj druga liczbe:");
				number_2 = scanner.nextInt();
				break;
			case 4:
				calculate(number_1, number_2, sign);
				break;

			default:
				System.out.println("Podales zla cyfre, sprobuj jeszcze raz :-)");
				break;
			}
		}
		System.out.println(number_1 + " " + number_2);
	}

	static void calculate(int number_1, int number_2, char sign) {

		int result;

		if (sign == '+' || sign == '-' || sign == '*' || sign == '/') {
			if (sign == '+') {
				result = number_1 + number_2;
				System.out.println("Wynik dzialania: " + result);
			} else if (sign == '-') {
				result = number_1 - number_2;
				System.out.println("Wynik dzialania: " + result);
			} else if (sign == '*') {
				result = number_1 * number_2;
				System.out.println("Wynik dzialania: " + result);
			} else {
				if (number_1 == 0 || number_2 == 0) {
					System.out.println("NIE DZIELIMY PRZEZ ZERO!!!");
				} else {
					result = number_1 / number_2;
					System.out.println("Wynik dzialania: " + result);
				}

			}

		} else {
			System.out.println("Podales zly symbol operacji.");
		}

	}

}
