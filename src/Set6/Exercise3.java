package Set6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*Napisać funkcję public static void sumujIZapisz(String nazwaPliku) , 
która odczytuje plik o podanej nazwie zawierający liczby całkowite (po jednej w wierszu). Funkcja ma za zadanie odczytać i 
zsumować wszystkie liczby z pliku, a następnie dopisać na końcu pliku wyznaczoną sumę powiększoną o 1. 
Ponowne uruchomienia funkcji będą skutkowały dopisywaniem kolejnych wierszy. 
Jeżeli plik nie istnieje to ma zostać utworzony – suma dla pustego pliku wyniesie 0, a więc należy dopisać wiersz zawierający 1*/

public class Exercise3 {

	public static void main(String[] args) throws IOException {
		String fileName = "/Users/krystek/Desktop/plik32.txt";
		File f = new File(fileName);

		if (f.exists() && f.isFile()) {
			System.out.println("Plik istnieje.");
		} else {
			f.createNewFile();
			System.out.println("Plik zostal utworzony.");
		}

		sumAndSave(fileName);

	}

	static void sumAndSave(String fileName) throws IOException {

		BufferedReader file = null;
		PrintWriter fileS = null;

		int sum = 0;
		int tmp;

		try {
			file = new BufferedReader(new FileReader(fileName));

			String line = file.readLine();

			while (line != null) {

				tmp = Integer.parseInt(line);
				sum += tmp;
				line = file.readLine();
			}

			fileS = new PrintWriter(new FileWriter(fileName, true));
			fileS.println((char) 13 + (sum + 1));

		} finally {
			if (file != null) {
				file.close();
			}
			if (fileS != null) {
				fileS.close();
			}
		}

	}

}
