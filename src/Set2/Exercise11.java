package Set2;

/*Napisać program, który sprawdza, czy podana liczba całkowita n,n > 1, jest liczbą pierwszą.*/

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x;
		int number = 0;
		do {
			System.out.println("Podaj liczbe: ");
			x = scanner.nextInt();

			if (x <= 1) {
				System.out.println("Liczba nie spelnia warunku: 'x>1'");
			}

		} while (x <= 1);

		for (int i = 1; i <= x; i++) {

			if (x % i == 0) {
				number++;
			}
		}

		if (number == 2) {
			System.out.println("Podana liczba jest liczba pierwsza.");
		} else {
			System.out.println("Podana liczba nie jest liczba pierwsza.");
		}
	}

}
