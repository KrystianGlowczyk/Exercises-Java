package Set5;

import java.util.Scanner;

/*Napisać funkcję String flipCase(String text) , która zamieni małe litery na duże i odwrotnie 
w łańcuchu podanym jako parametr. Wynikiem ma być łańcuch znaków zawierający kopię łańcucha 
po zmianie wielkości liter.*/

public class Exercise4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj tekst: ");
		String text = scanner.nextLine();

		System.out.println(flipCase(text));

	}

	static String flipCase(String text) {
		String newText = "";
		int value;
		char letter;

		for (int i = 0; i < text.length(); i++) {

			letter = text.charAt(i);
			value = (int) letter;

			if (value > 96 && value < 123) {
				value = value - 32;
				letter = (char) value;
				newText += letter;
			} else if (value > 64 && value < 91) {
				value = value + 32;
				letter = (char) value;
				newText += letter;
			} else {
				newText += " ";
			}

		}

		return newText;
	}

}
