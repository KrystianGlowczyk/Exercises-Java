package Set1;

import java.util.Scanner;

/*W sklepie ze sprzętem AGD oferowana jest sprzedaż installmentlna. Napisz program umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla programu są:
• cost towaru (od 100 zł do 10 tyś. zł), • liczba rat (od 6 do 48).
import java.util.Scanner;*/

public class Exercise5 {

	public static void main(String[] args) {
		int number = 0;
		double cost = 0;

		Scanner scanner = new Scanner(System.in);
		while (!(number >= 6 && number <= 48) || !(cost <= 100000.00 && cost >= 10000.00)) {

			System.out.println("Prosze podac kwote w PLN: ");
			cost = scanner.nextDouble();

			System.out.println("Prosze podac liczbe rat: ");
			number = scanner.nextInt();

			if (!(number >= 6 && number <= 48) || !(cost <= 100000.00 && cost >= 10000.00)) {
				System.out.println("Niepoprawne dane, wprowadz dane ponownie.\n");
			}
		}

		double percent = interest(number);
		calculateTheInstallment(cost, number, percent);

	}

	static double interest(int number) {
		double percent;

		if (number >= 6 && number <= 12) {
			percent = 0.025;
		} else if (number > 12 && number <= 24) {
			percent = 0.05;
		} else {
			percent = 0.1;
		}

		return percent;
	}

	static void calculateTheInstallment(double amount, int number, double interest) {

		double installment;
		double numberDouble = number;

		installment = amount / numberDouble + (amount * interest);

		System.out.format("Rata miesieczna wynosi: %.2f PLN, liczba rat: %d", installment, number);

	}

}
