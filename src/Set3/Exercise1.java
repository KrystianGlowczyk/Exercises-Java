package Set3;

/*Napisać program, który:
• utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z
przedziału [−10, . . . , 10],
• wypisze na ekranie zawartość tablicy,
• wyznaczy najmniejszy oraz najwięszy element w tablicy,
• wyznaczy średnią arytmetyczną elementów tablicy,
• wyznaczy ile elementów jest mniejszych, ile większych od średniej.
• wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatnie- go do pierwszego.*/

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {

		int[] tab = new int[10];
		int min = tab[0], max = tab[0], average, counterL = 0, counterS = 0, sum = 0;
		Random random = new Random();

		System.out.println("Wygenerowane liczby: ");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = random.nextInt(21) - 10;
			System.out.print(tab[i] + ", ");

			if (tab[i] > max) {
				max = tab[i];
			} else if (tab[i] < min) {
				min = tab[i];
			}
		}

		System.out.println("\nMIN: " + min);
		System.out.println("MAX: " + max);

		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}

		average = sum / tab.length;

		System.out.println("Srednia wartosc: " + average);

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] < average) {
				counterS++;
			} else if (tab[i] > average) {
				counterL++;
			}
		}

		System.out.println("Mniejszych od sredniej: " + counterS);
		System.out.println("Wiekszych od sredniej: " + counterL);

		for (int i = tab.length - 1; i >= 0; i--) {
			System.out.print(tab[i] + ", ");
		}

	}

}
