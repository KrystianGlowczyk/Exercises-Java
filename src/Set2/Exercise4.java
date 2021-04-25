package Set2;

/*Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, 
do- póki nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich poda- nych liczb.*/

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		int suma = 0;
		int x;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Podaj liczbe: ");
			x = scanner.nextInt();
			suma += x;

		} while (x != 0);

		System.out.println("Suma wynosi: " + suma);
	}

}
