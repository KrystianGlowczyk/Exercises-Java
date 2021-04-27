package Set5;

import java.util.Scanner;

/*Zdefiniować funkcję int strpos(String text, char z) , która zwraca indeks na którym znajduje się
znak z (drugi parametr) w podanym łańcuchu text .
Jeżeli znak z nie występuje w łańcuchu, to wynikiem funkcji powinno być -1. 
Uwaga - pozycje znaków numerujemy począwszy od 0.*/

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wpisz test: ");
		String text = scanner.nextLine();
		char z = 'X';

		System.out.println(strpos(text, z));

	}

	static int strpos(String text, char z) {

		int tmp = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == z) {
				tmp = i;
				break;
			} else if (text.charAt(i) != z) {
				tmp = -1;
			}

		}
		return tmp;
	}

}
