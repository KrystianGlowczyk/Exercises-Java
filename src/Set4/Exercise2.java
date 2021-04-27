package Set4;

/*Napisać program, który wczytuje od użytkownika ciąg znaków, 
a następnie two- rzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.*/

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj ciag znakow: ");
		String str = scanner.nextLine();

		String newStr = Character.toString(str.charAt(str.length() - 1));

		for (int i = str.length() - 2; i >= 0; i--) {
			newStr += str.charAt(i);

		}

		System.out.println(newStr);

	}

}
