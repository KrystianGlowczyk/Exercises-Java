package Set1;
/* Napisać program służący do konwersji wartości temperatury podanej w stopniach Celsjusza 
 * na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
 */

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);
			System.out.println("Podaj temperature w C, aby zamienic na F:");

			double temp = scanner.nextDouble();

			temp = convert(temp);

			System.out.println(temp);
		}

	

	static double convert(double x) {

		double far = x * 1.8 + 32.0;

		return far;
	}

	}
