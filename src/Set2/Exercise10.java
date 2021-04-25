package Set2;

/*Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki. 
Przykła- dowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.*/

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int number = scanner.nextInt();

		System.out.format("Dzielniki liczby %d: ", number);

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.format("%d, ", i);
			}
		}
	}

}
