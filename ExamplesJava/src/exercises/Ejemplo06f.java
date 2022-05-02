package exercises;

import java.util.Scanner;

public class Ejemplo06f {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		String nombre = scanner.nextLine();
		System.out.println("¡Hola "+ nombre + "! ¿Qué tal?");
		scanner.close();
	}

}
