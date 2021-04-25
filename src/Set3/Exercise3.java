package Set3;

/*Napisz program, który:
• stworzy tablicę (macierz) 5 x 5 liczb całkowitych,
• wypełnij ją losowymi wartościami z zakresu {−5, −4, . . . , 5}, 
• dla każdej kolumny wyznacz minimum,
• dla każdej kolumny wyznaczy maksimum.
• dla każdego wiersza wyznacz minimum,
• dla każdego wiersza wyznaczy maksimum.*/

import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {

		int[][] tab = new int[5][5];
		Random random = new Random();

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = random.nextInt(11) - 5;
			}
		}

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + ", ");
			}
			System.out.println();
		}

		for (int i = 0; i < tab.length; i++) {
			int max = tab[i][0];
			int min = tab[i][0];
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] < min) {
					min = tab[i][j];
				} else if (tab[i][j] > max) {
					max = tab[i][j];
				}
			}
			System.out.format("\nDla wiersza: %d", i + 1);
			System.out.println("\nMAX: " + max);
			System.out.println("MIN: " + min);

		}

		for (int i = 0; i < tab.length; i++) {
			int max = tab[0][i];
			int min = tab[0][i];
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[j][i] < min) {
					min = tab[j][i];
				} else if (tab[j][i] > max) {
					max = tab[j][i];
				}
			}
			System.out.format("\nDla kolumny: %d", i + 1);
			System.out.println("\nMAX: " + max);
			System.out.println("MIN: " + min);

		}

	}

}
