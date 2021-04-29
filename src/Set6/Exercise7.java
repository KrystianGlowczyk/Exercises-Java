package Set6;

import java.io.FileReader;
import java.io.IOException;

/*Napisać program, który dla pliku tekstowego o podanej nazwie wyznaczy „wykres” częstości wystąpień małych liter alfabetu angielskiego. 
Słupki wykresu mają zostać utworzone ze znaków gwiazdki ’*’, przy czym długość słupka dla najczęściej występującej litery powinna wynosić 50. 
Dodatkowo dla każdego znaku należy dodatkowo wyświetlić liczbę jego wystąpień.*/

public class Exercise7 {

	public static void main(String[] args) throws IOException {
		String name = "/Users/krystek/Desktop/plik.txt";

		count(name);

	}

	static void count(String name) throws IOException {
		FileReader file = null;
		int[] tab = new int[26];

		try {
			file = new FileReader(name);
			int c = file.read();

			while (c != -1) {

				for (int i = 0; i < tab.length; i++) {
					if (c == (97 + i)) {
						tab[i]++;
					}
				}
				c = file.read();

			}

			int max = tab[0];
			double c1;
			for (int i = 0; i < tab.length; i++) {
				if (tab[i] > max) {
					max = tab[i];
				}
			}

			c1 = (double) max / 50.0;

			double count;

			for (int j = 0; j < tab.length; j++) {
				count = (double) tab[j] / c1;
				System.out.print((char) (97 + j) + ":");
				for (int i = 0; i < 50; i++) {
					if (i < (int) count) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println(" " + tab[j]);
			}

		} finally {
			if (file != null) {
				file.close();
			}
		}
	}

}
