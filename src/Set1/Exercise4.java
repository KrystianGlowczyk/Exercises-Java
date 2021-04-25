package Set1;

/*Napisaćprogramobliczającynależnytaxincome owyodosóbfizycznych.Pro- gram ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny tax. tax obliczany jest wg. następujących reguł:
• do 85.528 tax wynosi 18% podstawy minus 556,02 PLN,
• od 85.528 tax wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00 */
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj swoj dochod: ");
		double income = scanner.nextDouble();

		tax(income);
	}

	static void tax(double income) {
		double tax;

		if (income <= 85528.00) {
			tax = (0.18 * income) - 556.02;
		} else {

			double difference = income - 85528.00;
			tax = 14839.02 + (0.32 * difference);
		}

		System.out.format("Podatek wynosi: %.2f PLN", tax);
	}

}
