import java.util.Scanner;

public class Esercizio04 {
	public static void main(String[] args) {
		System.out.println("---Esercizi Giorno 01 Java---");
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il valore del primo lato:");
		double lato1 = input.nextDouble();
		System.out.println("Inserisci il valore del secondo lato:");
		double lato2 = input.nextDouble();
		System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(lato1, lato2));

		System.out.println("Inserisci un numero intero");
		int numero = input.nextInt();
		System.out.println(pariDispari(numero));

		System.out.println("Inserire primo lato");
		double latoTr1 = input.nextDouble();
		System.out.println("Inserire secondo lato");

		double latoTr2 = input.nextDouble();
		System.out.println("Inserire terzo lato");
		double latoTr3 = input.nextDouble();
		System.out.println("L'area del triangolo è: "+perimetroTriangolo(latoTr1,latoTr2,latoTr3));
		input.close();
	}

	public static double perimetroRettangolo(double a, double b) {
		return 2 * (a + b);
	}

	public static int pariDispari(int num) {
		if (num % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static double perimetroTriangolo(double a, double b, double c) {
		 double s = (a + b + c) / 2;
		 double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
	        return area;
	}

}
