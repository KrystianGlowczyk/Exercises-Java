package Set7.Exercise1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String name = "/Users/krystek/Desktop/plik.txt";

		Position p1 = new Position("Chleb", 1, 3.5);
		Position p2 = new Position("Cukier", 3, 4);
		Position p3 = new Position("Ananas", 5, 4.5);
		Position p4 = new Position("Jajko", 10, 2.5);
		Position p5 = new Position("Jajko", 20, 2.5);

		Order z = new Order(5);
		z.addPosition(p1);
		z.addPosition(p2);
		z.addPosition(p3);
		z.addPosition(p4);
		System.out.println(z);
		z.deletePosition(2);
		System.out.println(z);
		z.updatePosition(0, "Jogurt", 3.5, 3);
		System.out.println(z);
		z.addPosition(p5);
		System.out.println(z);

		saveToFile(name, z);
		System.out.println("\n\nOdczyt:\n");
		readFile(name);

	}

	static void saveToFile(String name, Order z) throws IOException {
		ObjectOutputStream file = null;
		try {

			file = new ObjectOutputStream(new FileOutputStream(name));
			file.writeObject(z);
			file.flush();

		} finally {
			if (file != null) {
				file.close();
			}
		}
	}

	static void readFile(String name) throws IOException, ClassNotFoundException {
		ObjectInputStream file = null;
		Order z = null;

		try {
			file = new ObjectInputStream(new FileInputStream(name));
			z = (Order) file.readObject();
			System.out.println(z);

		} catch (EOFException ex) {
			System.out.println("Koniec pliku.");
		} finally {
			if (file != null) {
				file.close();
			}
		}
	}

}
