import java.util.Scanner;

public class Esercizio03 {
	public static void main(String[] args) {
		System.out.println("---Esercizi Giorno 01 Java---");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci la prima stringa:");
		String stringa1 = scanner.nextLine();

		System.out.println("Inserisci la seconda stringa:");
		String stringa2 = scanner.nextLine();

		System.out.println("Inserisci la terza stringa:");
		String stringa3 = scanner.nextLine();

		String ordinato = stringa1 + stringa2 + stringa3;
		System.out.println("Concatenazione ordinata: " + ordinato);

		String inverso = stringa3 + stringa2 + stringa1;
		System.out.println(
				"Concatenazione inversa: " + inverso);
		scanner.close();
	}
}
