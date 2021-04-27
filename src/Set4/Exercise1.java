package Set4;

/*Napisać program, który wczytuje od użytkownika ciąg znaków, 
a następnie wy- świetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.*/

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj ciag znakow: ");
		String str = scanner.nextLine();

		char token = str.charAt(str.length() - 1);

		counter(str, token);

	}

	static void counter(String str, char token) {

		int number = 0;
		char tmp;

		for (int i = 0; i < str.length(); i++) {
			tmp = str.charAt(i);
			if (tmp == token) {
				number++;
			}
		}

		System.out.println("Liczba powtorzen: \"" + token + "\" wynosi: " + number);

	}

}
