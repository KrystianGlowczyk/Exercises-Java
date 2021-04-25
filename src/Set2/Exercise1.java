package Set2;
/*Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, 
a na- stępnie wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od podanej liczby. 
Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.*/

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		int rest;
		int number;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Podaj liczbe parzysta: ");

			number = scanner.nextInt();
			rest = number % 2;

			if (rest == 1) {
				System.out.println("Podana liczba jest nieparzysta.");
			}

		} while (rest == 1);

		System.out.println("Liczby nieparzyste mniejsze od: " + number);

		for (int i = 0; i < number; i++) {
			int odd = i % 2;
			if (odd == 1) {
				System.out.format("%d, ", i);
			}

		}

	}

}