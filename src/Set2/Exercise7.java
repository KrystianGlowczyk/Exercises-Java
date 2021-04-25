package Set2;

/*Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekra- nie prostokąt. 
Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego górnego rogu prostokąta (x, y) 
oraz długości boków prostokąta (ab). 
Przyjmujemy, że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).*/

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a, b, x, y;
		char zn;

		System.out.println("Podaj X: ");
		x = scanner.nextInt();

		System.out.println("Podaj Y:");
		y = scanner.nextInt();

		System.out.println("Podaj A: ");
		a = scanner.nextInt();

		System.out.println("Podaj B: ");
		b = scanner.nextInt();

		System.out.println("Podaj znak: ");
		zn = scanner.next().charAt(0);

		for (int i = 0; i < y; i++) {
			System.out.println();
		}

		int tmp = 0;

		while (tmp <= a) {
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < b; k++) {
				System.out.print(zn);
			}
			System.out.println();
			tmp++;
		}
	}

}
