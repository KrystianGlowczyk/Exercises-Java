package Set4;

/*Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu arytmetycznym nawiasy są poprawnie sparowane. 
Wyrażenie podawane jest jako pojedynczy łańcuch znaków. 
Program powinien wyświetlić stosowny komunikat.*/

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj wyrazenie: ");
		String str = scanner.nextLine();

		int poc = 0;
		int pcc = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(') {
				poc++;
			} else if (str.charAt(i) == ')') {
				pcc++;
			}
		}

		if (poc == pcc) {
			System.out.println("OK");
		} else {
			System.out.println("Bledne sparowanie nawiasow.");
		}

	}

}
