package Set1;
/* Napisać program, który oblicza wartość współczynnika BMI */

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double weight, height;

		System.out.println("Podaj wage (kg): ");
		weight = scanner.nextDouble();

		System.out.println("Podaj wzrost (cm): ");
		height = scanner.nextDouble();
		height = height / 100;
		BMI(weight, height);
	}

	static void BMI(double weight, double height) {

		double bmi = weight / (height * height);

		if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Waga prawidlowa!");
		} else if (bmi < 18.5) {
			System.out.println("Niedowaga!");
		} else {
			System.out.println("Schudnij!");
		}
	}

}
