package Set5;

import java.util.Scanner;

/*Napisz funkcję, która zwraca wartość silni dla podanej liczby n. 
Funkcja powinna być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.*/

public class Exercise1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int liczba = scanner.nextInt();

		System.out.println("Silnia: " + silnia(liczba));
		System.out.println("Silnia Rek: " + silniaRek(liczba));

	}

	static int silnia(int x) {

		int wynik = 1;

		for (int i = 1; i <= x; i++) {
			wynik = wynik * i;
		}

		return wynik;
	}

	static int silniaRek(int x) {

		if (x == 0) {
			return 1;
		} else
			return x * silniaRek(x - 1);

	}

}
