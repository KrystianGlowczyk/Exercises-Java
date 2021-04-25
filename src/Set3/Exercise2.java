package Set3;

/*Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10, 
a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.*/

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {

		int[] tab = new int[20];
		Random random = new Random();
		int counter = 0;

		System.out.println("Wylosowane liczby: ");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = random.nextInt(10) + 1;
			System.out.print(tab[i] + ", ");
		}

		System.out.println();

		for (int j = 1; j <= 10; j++) {
			for (int i = 0; i < tab.length; i++) {

				if (tab[i] == j) {
					counter++;
				}

			}

			System.out.println(j + " - " + counter);
			counter = 0;

		}

	}

}
