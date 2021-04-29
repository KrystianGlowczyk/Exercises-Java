package Set6;

/*Napisać funkcję, której zadaniem jest odczytanie danych tabelarycznych z pliku tekstowego, 
a następnie zapisanie ich do nowego pliku w postaci kodu HTML.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise6 {

	public static void main(String[] args) throws IOException {

		String name = "/Users/krystek/Desktop/plik.txt";

		doHtml(name);

	}

	static void doHtml(String fileName) throws IOException {

		BufferedReader file = null;
		PrintWriter fileHTML = null;

		try {

			file = new BufferedReader(new FileReader(fileName));
			fileHTML = new PrintWriter(new FileWriter("/Users/krystek/Desktop/htmlFILE.html"));
			String line = file.readLine();
			String[] tab = new String[4];

			fileHTML.println("<html><body>");
			fileHTML.println("<table>");
			fileHTML.println("<html><body>");
			fileHTML.println("<tr><td>\"Waga\"</td><td>\"Wzrost\"</td><td>\"BMI\"</td><td>\"Nadwaga\"</td></tr>");

			while (line != null) {

				tab = line.split(" ");

				fileHTML.println("<tr><td>" + tab[0] + "</td><td>" + tab[1] + "</td><td>" + tab[2] + "</td><td>"
						+ tab[3] + "</td></tr>");

				line = file.readLine();
			}

			fileHTML.println("</table>");
			fileHTML.println("</body></html>");

		} finally {
			if (file != null) {
				file.close();
			}
			if (fileHTML != null) {
				fileHTML.close();
			}

		}

	}

}
