package Set6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Napisać funkcję:
    public static void search(String plikIn, String plikOut, String word)
której zadaniem jest znalezienie wszystkich wierszy w pliku, które zawierają szukane słowo. 
Wszystkie wiersze, które zawierają słowo powinny zostać zapisane w pliku wynikowym wraz z nr wiersza (z pierwszego pliku). 
*/

public class Exercise2 {

	public static void main(String[] args) throws IOException {

		search("/Users/krystek/Desktop/plik.txt", "/Users/krystek/Desktop/plik2.txt", "ma");

	}

	static void search(String fileIn, String fileOut, String word) throws IOException {

		BufferedReader file = null;
		FileWriter newFile = null;
		int value;

		try {
			file = new BufferedReader(new FileReader(fileIn));
			newFile = new FileWriter(fileOut);
			String line = file.readLine();

			while (line != null) {

				value = line.indexOf(word);

				if (value >= 0) {

					newFile.write(line);
					newFile.write((char) 13);

				}
				line = file.readLine();
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
