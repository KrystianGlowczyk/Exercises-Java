package Set4;

/*Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie spraw- dza, 
czy podany ciąg jest palindromem.*/

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj ciag znakow: ");
		String str = scanner.nextLine();
		str = str.toUpperCase();
		str = str.replace(" ", "");
		// System.out.println(str);

		String newStr = Character.toString(str.charAt(str.length() - 1));

		for (int i = str.length() - 2; i >= 0; i--) {
			newStr += str.charAt(i);

		}

		int counter = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == newStr.charAt(i)) {
				counter++;
			}
		}

		if (counter == str.length()) {
			System.out.println("Jest palindromem.");
		} else {
			System.out.println("Nie jest palindromem.");
		}

	}

}
