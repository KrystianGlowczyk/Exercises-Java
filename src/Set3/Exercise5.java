package Set3;

/*Napisz program, który pobiera od użytkownika dodatnią liczbę naturalną n 
i tworzy tablicę a zmiennych typu logicznego (boolean) o rozmiarze n×n. 
Następnie program powinien wypełnić utworzoną tablicę, tak by a[i][j] = true 
jeżeli liczby (i+1) oraz (j+1) są względnie pierwsze, tzn. nie mają wspólnych dzielników poza 1. 
Tak utworzoną tablicę należy wypisać na ekranie, 
przy czym dla wartości true należy wyświetlić znak ”+”, natomiast dla wartości false znak ”.”*/

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj rozmiar tablicy: ");
		int size = scanner.nextInt();
		boolean[][] tab = new boolean[size][size];
		boolean flag;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				flag = check(i + 1, j + 1);
				tab[i][j] = flag;
			}
		}

		print(tab);

	}

	static boolean check(int x, int y) {
		int[] tmp = new int[32];
		int[] tmp2 = new int[32];
		int count1 = 0;
		int count2 = 0;
		int common = 0;

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				tmp[count1] = i;
				count1++;
			}
		}

		for (int i = 1; i <= y; i++) {
			if (y % i == 0) {
				tmp2[count2] = i;
				count2++;
			}
		}

		for (int i = 0; i < count1; i++) {
			for (int j = 0; j < count2; j++) {
				if (tmp[i] == tmp2[j]) {
					common++;
				}
			}
		}

		if (common > 1) {
			return false;
		} else
			return true;
	}

	static void print(boolean[][] tab) {

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] == true) {
					System.out.print("+ ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}

	}

}
