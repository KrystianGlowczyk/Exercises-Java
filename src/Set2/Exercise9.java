package Set2;

/*Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
	• oblicza sumę cyfr tej liczby,
	• stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej cyfr nieparzystych.*/

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj cyfre: ");
		int number = scanner.nextInt();
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;

		while (number > 0) {
			int digit = number % 10;
			number = number / 10;

			sum += digit;

			if (digit % 2 == 0) {
				evenSum += digit;
			} else {
				oddSum += digit;
			}

		}

		double ratio = (double) evenSum / (double) oddSum;

		System.out.println("Suma cyfr wynosi: " + sum);
		System.out.println("Suma cyfr parzystych wynosi: " + evenSum);
		System.out.println("Suma cyfr nieparzystych wynosi: " + oddSum);
		System.out.format("Stosunek parzystych do nieparzystych: %.3f", ratio);
	}
}
