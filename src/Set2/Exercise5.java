package Set2;

/*Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. 
Pobieranie danych kończone jest podaniem wartości 0 (nie wliczana do danych). 
W następ- nej kolejności program powinien wyświetlić sumę największej 
oraz najmniejszej z podanych liczb oraz ich średnią arytmetyczną.*/

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;

		System.out.println("Podaj ciag cyfr, na koncu podaj '0.'");
		str = scanner.nextLine();

		str = str.substring(0, str.length() - 2);
		str = str.replaceAll(" ", "");

		// System.out.println(str);

		String[] sep = str.split(",");
		// System.out.println(Arrays.toString(sep));

		int[] numbers = new int[sep.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(sep[i]);
		}

		// System.out.println(Arrays.toString(numbers));

		int min = numbers[0];
		int max = numbers[0];
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}

			sum += numbers[i];
		}

		double average = (double) sum / (double) numbers.length;

		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
		System.out.println("SUMA: " + sum);
		System.out.format("SREDNIA: %.2f", average);
	}

}
