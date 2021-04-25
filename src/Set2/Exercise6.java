package Set2;

/*Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1...100, a gracz (użytkownik) ma za zadanie odgadnąć, 
 * co to za liczba poprzez podawanie kolej- nych wartości. Jeżeli podana wartość jest:
• większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
• mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
• identyczna z wygenną – wyświetlany jest komunikat „Gratulacje” i gra się kończy.*/

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		int x;
		int gen = random.nextInt(100) + 1;
		System.out.println(gen);

		do {

			System.out.println("Podaj liczbe: ");
			x = scanner.nextInt();

			if (x > gen) {
				System.out.println("Podales za duza wartosc :c");
			} else if (x < gen) {
				System.out.println("Podales za mala wartosc :c");
			} else {
				System.out.println("Gratulacje!");
				flag = false;
			}

		} while (flag);
	}

}
