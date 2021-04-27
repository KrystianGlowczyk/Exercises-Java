package Set6;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*Stworzyć dwie funkcje:
    void szyfruj(String nazwaWe, int przesun)
    void deszyfruj(String nazwaWe, int przesun)
Funkcja szyfruj dokonuje szyfrowania pliku, którego nazwa podana została jako pierwszy parametr. 
Szyfrowanie polega na zamianie każdej litery na znak przesunięty o wartość podaną drugim parametrem 
np. dla przesunięcia równego 2 literka ’a’ powinna zostać zastąpiona literką ’c’, literka ’z’ literką ’b’ itp.
Wynikiem działania funkcji ma być plik o nazwie utworzonej na podstawie nazwy pliku wejściowego poprzez dołączenie znaku ’_’ 
np. dla pliku dane.txt zaszyfrowana postać powinna miec ́nazwę _dane.txt.
Funkcja deszyfruj powinna deszyfrowac ́plik (niekoniecznie ten sam) zaszyfrowany przez funkcję szyfruj.*/

public class Exercise4 {

	public static void main(String[] args) throws IOException {

		String name = "plik";
		int move = 5;

		encrypt(name, move);
		System.out.println("Plik zaszyfrowany!");

		decrypt(name, move);
		System.out.println("Plik odszyfrowany!");

	}

	static void encrypt(String name, int shift) throws IOException {

		FileReader file = null;
		File f = new File("/Users/krystek/Desktop/" + "_" + name + ".txt");
		PrintWriter newFile = null;
		char x;

		try {
			file = new FileReader("/Users/krystek/Desktop/" + name + ".txt");
			newFile = new PrintWriter(f);

			int c = file.read();

			while (c != -1) {

				if ((c < 123 && c > 96) || (c < 91 && c > 64)) {

					int tmp = c + shift;

					if ((tmp > 122 && c < 123) || (tmp > 90 && c < 91)) {

						c = c + shift - 26;
						x = (char) c;
						newFile.print(x);
						c = (int) file.read();

					} else {
						c += shift;
						x = (char) c;
						newFile.print(x);
						c = (int) file.read();
					}

				} else {

					x = (char) c;
					newFile.print(x);
					c = (int) file.read();
				}
			}

		} finally {
			if (file != null) {
				file.close();
			}
			if (newFile != null) {
				newFile.close();
			}
		}
	}

	static void decrypt(String name, int shift) throws IOException {

		FileReader file = null;
		File f = new File("/Users/krystek/Desktop/" + name + "5.txt");
		PrintWriter newFile = null;
		char x;

		try {
			file = new FileReader("/Users/krystek/Desktop/_" + name + ".txt");
			newFile = new PrintWriter(f);

			int c = file.read();

			while (c != -1)

				if ((c < 123 && c > 96) || (c < 91 && c > 64)) {

					int tmp = c - shift;

					if ((tmp < 97 && c > 96) || (tmp < 65 && c > 64)) {

						c = c - shift + 26;
						x = (char) c;
						newFile.print(x);
						c = (int) file.read();

					} else {
						c -= shift;
						x = (char) c;
						newFile.print(x);
						c = (int) file.read();
					}

				} else {

					x = (char) c;
					newFile.print(x);
					c = (int) file.read();
				}

		} finally {
			if (file != null) {
				file.close();
			}
			if (newFile != null) {
				newFile.close();
			}
		}
	}
}
