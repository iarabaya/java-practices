package exercises;

import java.util.Scanner;

/*
 * Pidele al usuario que escriba <<abracadabra>> e insiste hasta que lo haga bien
 */
public class Ejercicio06e {
	private static final String CLAVE = "abracadabra";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palabra = "";
		do {
			System.out.println("Escribe abracadabra:");
			palabra = scanner.nextLine();	
		} while (!palabra.equals(CLAVE));
		
		scanner.close();
		System.out.println("TU: " + palabra);
		System.out.println("YO: pata de cabra!");
	}

}
