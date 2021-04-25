package Set2;

/*Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, 
A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu (A, A + 1, . . . , B). 
Obliczenia należy wykonać trzykrotnie stosując kolejno pętle: while, do-while, for.*/
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		do {
			System.out.println("Podaj liczbe A: ");
			a = scanner.nextInt();

			System.out.println("Podaj liczbe B: ");
			b = scanner.nextInt();

			if (a >= b) {
				System.out.println("Niespelniony warunek: A < B.");
			}

		} while (a >= b);

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println("For: " + sum);

		sum = 0;
		int tmp = a;

		while (tmp <= b) {
			sum += tmp;
			tmp++;
		}
		System.out.println("While: " + sum);
		sum = 0;
		int tmp2 = a;

		do {
			sum += tmp2;
			tmp2++;
		} while (tmp2 <= b);

		System.out.println("Do while: " + sum);
	}

}
