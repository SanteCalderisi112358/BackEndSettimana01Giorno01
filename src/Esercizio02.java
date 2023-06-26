public class Esercizio02 {
	public static void main(String[] args) {
		System.out.println("---Esercizi Giorno 01 Java---");
		int n1 = 4;
		int n2 = 5;
		int n3 = 12;
		String stringa = "ciao";
		String[] array = { "Css", "Html", "Js", "Java", "Ts" };
		String stringa2 = "Angular";

		System.out.println("Il prodotto tra " + n1 + " e " + n2 + " è: " + moltiplica(n1, n2));
		System.out.println(
				"Il concatenamento tra la stringa " + "'" + stringa + "'" + " e il numero " + n3 + " è: "
						+ concatena(stringa, n3));
		System.out.println("Array di partenza:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\nStringa: " + stringa2);
		System.out.println("\nArray finale:");
		for (int i = 0; i < inserisciInArray(array, stringa2).length; i++) {
			System.out.println(inserisciInArray(array, stringa2)[i]);
		}
	
}

public static int moltiplica(int n1, int n2) {
	int prodotto = n1 * n2;
	return prodotto;
}

public static String concatena(String stringa, int n3) {
	return stringa + n3;
}

public static String[] inserisciInArray(String[] array1, String stringa) {
	String array2[] = new String[6];
	array2[0] = array1[0];
	array2[1] = array1[1];
	array2[2] = array1[2];
	array2[3] = stringa;
	array2[4] = array1[3];
	array2[5] = array1[4];

	return array2;

}
}
