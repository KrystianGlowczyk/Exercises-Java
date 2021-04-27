package Set5;

import java.util.Scanner;

/*Napisz funkcję, która zwraca wartość n-tego wyrazu ciągu Fibonacciego. 
Funkcja powinna być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.*/

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int n = scanner.nextInt();

		System.out.println("Ciag F Rekurencyjnie: " + fibonacciR(n));
		System.out.println("Ciag F: " + fibo(n));

	}

	static int fibonacciR(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return (fibonacciR(n - 1) + fibonacciR(n - 2));
		}
	}

	static int fibo(int n) {
		if (n <= 2) {
			return n;
		} else {
			int f1 = 1;
			int f2 = 1;
			int temp;

			for (int i = 3; i <= n; i++) {
				temp = f1 + f2;
				f1 = f2;
				f2 = temp;
			}
			return f2;
		}
	}
}
