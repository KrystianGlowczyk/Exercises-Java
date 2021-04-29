package Set6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*Napisać funkcję emerytura(String nazwaPliku), która wczyta z pliku o podanej nazwie dane pracowników zapisane w kolejnych 
wierszach w następujący sposób: Imię Nazwisko Płeć Wiek
Przykład:
Tomasz Nowak M 45
Marta Ziobro K 42
Jan Kowalski M 27
Ewelina Tusk K 59
Następnie funkcja dla każdego pracownika powinna wyznaczyć ile lat pozostało do jego emerytury. 
Wyniki należy zapisać w następujący sposób:
Nazwisko Imię ”Lata do emerytury”
Przykład:
Nowak Tomasz 20
Kowalski Jan 38
Wyniki dla kobiet należy zapisać w pliku o nazwie ”kobiety.txt”, natomiast wyniki dla mężczyzn należy zapisać w pliku ”mezczyzni.txt”.*/

public class Exercise5 {

	public static void main(String[] args) throws IOException {

		String name = "/Users/krystek/Desktop/plik.txt";

		retiring(name);

	}

	static void retiring(String fileName) throws IOException {

		BufferedReader file = null;
		PrintWriter fileM = null;
		PrintWriter fileW = null;

		try {

			file = new BufferedReader(new FileReader(fileName));
			fileM = new PrintWriter(new FileWriter("/Users/krystek/Desktop/mezczyzni.txt"));
			fileW = new PrintWriter(new FileWriter("/Users/krystek/Desktop/kobiety.txt"));
			String line = file.readLine();
			String[] tab = new String[4];
			int retirementAge = 65;
			int rest;

			while (line != null) {

				tab = line.split(" ");
				rest = retirementAge - Integer.parseInt(tab[3]);

				if (tab[2].charAt(0) == 'M') {

					fileM.print(tab[1]);
					fileM.print(" ");
					fileM.print(tab[0]);
					fileM.print(" ");
					fileM.println(rest);

				} else if (tab[2].charAt(0) == 'K') {

					fileW.print(tab[1]);
					fileW.print(" ");
					fileW.print(tab[0]);
					fileW.print(" ");
					fileW.println(rest);

				}

				line = file.readLine();

			}

		} finally {
			if (file != null) {
				file.close();
			}
			if (fileM != null) {
				fileM.close();
			}
			if (fileW != null) {
				fileW.close();
			}
		}

	}

}
