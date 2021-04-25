package Set2;

/*Napisać program drawący w konsoli „choinkę” złożoną ze znaków gwiazdki (*). 
Użytkownik programu powinien podać liczbę całkowitą n, n > 0, 
określającą wysokość choinki (liczbę wierszy).*/

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int h;
		do {
			System.out.println("Podaj wysokosc choinki: ");
			h = scanner.nextInt();

			if (h < 0) {
				System.out.println("Podales liczbe ujemna.");
			}
		} while (h < 0);

		draw(h);
	}

	static void draw(int h) {
		int lg = 1;
		int j = 0;
		int temp = 0;

		for (int i = 0; i < h; i++) {

			for (j = temp; j < h; j++) {
				System.out.print(" ");
			}

			for (int i1 = 0; i1 < lg; i1++) {
				System.out.print("*");
			}
			temp++;
			lg += 2;
			System.out.println();
		}
	}
}
