package Set2;

/*Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, 
a następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana number.*/
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		number = scanner.nextInt();

		for (int i = 1; i <= number;) {
			System.out.println(i);
			i = i * 2;
		}
	}

}
