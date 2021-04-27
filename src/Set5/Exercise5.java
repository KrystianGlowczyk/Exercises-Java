package Set5;

import java.util.Scanner;

/*Zdefiniować funkcje, ktorą
sprawdza, czy łańcuch  a jest prefiksem łańcucha  b .*/

public class Exercise5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj pierwszy wyraz: ");
		String a = scanner.nextLine();
		System.out.println("Podaj drugi wyraz: ");
		String b = scanner.nextLine();

		System.out.println(startsWith(a, b));
		System.out.println(startsWith2(a, b));

	}

	static boolean startsWith(String str1, String str2) {

		boolean isOrNot = str1.startsWith(str2);

		return isOrNot;
	}

	static boolean startsWith2(String str1, String str2) {

		boolean isOrNot = true;

		for (int i = 0; i < str2.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				isOrNot = true;
			} else {
				isOrNot = false;
				break;
			}
		}

		return isOrNot;
	}

}
