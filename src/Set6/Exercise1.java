package Set6;

import java.io.FileReader;
import java.io.IOException;

/*Napisać funkcję liczZnakiSlowa, która zlicza: 
• liczbę znaków w pliku,
• liczbę białych znaków w pliku,
• liczbę słów w pliku.
Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla wymie-
nionych podpunktów.*/

public class Exercise1 {

	public static void main(String[] args) throws IOException {

		int[] tab = new int[3];

		tab = liczZnakiSlowa("/Users/krystek/Desktop/plik.txt");

		System.out.println("Biale znaki: " + tab[0]);
		System.out.println("Slowa: " + tab[1]);
		System.out.println("Znaki: " + tab[2]);

	}

	static int[] liczZnakiSlowa(String path) throws IOException {

		FileReader file = new FileReader(path);
		int[] tab = new int[3];
		int whiteSpace = 0;
		int words = 0;
		int chars = 0;
		int ascii;
		boolean flag = true;

		while ((ascii = file.read()) >= 0) {

			if ((Character.isWhitespace(ascii)) == true) {
				whiteSpace++;
				flag = true;
			} else {
				
				if (flag) {
					words++;
					flag = false;
				}
			}
			chars++;

		}

		tab[0] = whiteSpace;
		tab[1] = words;
		tab[2] = chars;

		file.close();

		return tab;
	}

}
