package Set5;

/*Zdefiniować funkcję int strToInt(String str) , która zamienia liczbę całkowitą zapisaną w postaci łańcucha na liczbę całkowitą typu int. 
Funkcja powinna przerywać konwersję w momencie napotkania pierwszego znaku nie należącego do zapisu liczby, zatem 
np. dla strToInt("-13krowa4-52") wynikiem powinno być -134.*/

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj ciag znakow: ");
		String text = scanner.nextLine();

		System.out.println("WYNIK: " + strToInt(text));

	}

	static int strToInt(String text) {

		String str = "";
		int value;
		char[] tab = { '-', '+', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		boolean flag = false;
		boolean end = false;

		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < tab.length; j++) {

				if (text.charAt(i) == tab[j]) {

					if (text.charAt(i) == '-' || text.charAt(i) == '+') {
						if (flag == false) {
							str += text.charAt(i);
							flag = true;
						} else {
							end = true;
							break;
						}
					} else {
						str += text.charAt(i);
						flag = true;
					}

				}
			}
			if (end == true) {
				break;
			}
		}
		if (str == "") {
			value = 0;
		} else {
			value = Integer.parseInt(str);
		}

		return value;
	}

}
