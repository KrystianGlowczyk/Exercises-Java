package Set5;

/*Zdefiniowaćfunkcję ,która szuka 
łańcucha X w łańcuchu Y i jeżeli go znajdzie, to jej wynikiem jest pozycja,
na której ten łańcuch zaczyna się w łańcuchu Y . Jeżeli nie udało się znaleźć łańcucha to wtedy wynikiem ma być -1*/

public class Exercise7 {

	public static void main(String[] args) {

		System.out.println(strFind("Ala ma kota", "Ala ma kota"));

	}

	static int strFind(String x, String y) {

		int value;

		value = x.indexOf(y);

		return value;
	}

}
