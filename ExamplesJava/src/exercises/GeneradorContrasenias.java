package exercises;

import java.util.Scanner;

public class GeneradorContrasenias {
	private static final String CONSONANTES = "bcdfghjklmnpqrstvwxyz";
	private static final String VOCALES = "aeiou";
	private static final String NUMEROS = "0123456789";
	private static final String SIMBOLOS = "!@#$%&/\\=?*-_<>";
	
	private static final int NUM_PARES = 3;
	private static final int NUM_NUMS = 2;
	private static final int NUM_SIMB = 1;
	
	private static final String OTRA = "N";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String respuesta;		
		do {
			String password = "";
			for (int i = 0; i < NUM_PARES; i++) {
				password += generarPar();
			}
			
			for (int i = 0; i < NUM_NUMS; i++) {
				password += getAleatorio(NUMEROS);
			}
			
			for(int i = 0; i< NUM_SIMB; i++) {
				password += getAleatorio(SIMBOLOS);
			}
			System.out.println("La contrasenia sugerida es: \n\t"+password);
			System.out.println("Si no le parece satisfactoria la propuesta pulse " + OTRA);
			System.out.println("Si le parece satisfactoria pulse cualquier tecla.");
			respuesta = scanner.nextLine();
			
		} while (respuesta.equalsIgnoreCase(OTRA));
		
		System.out.println("Fin.");
		
		scanner.close();
	}
	
	private static char getAleatorio(String opciones) {
		int pos = (int)(Math.random() * opciones.length());
		return opciones.charAt(pos);
	}
	
	private static String generarPar() {
		String par = "";
		
		if(Math.random() < 0.5) {		
			par += getAleatorio(VOCALES);
			par += getAleatorio(CONSONANTES);
		}else {
			par += getAleatorio(CONSONANTES);
			par += getAleatorio(VOCALES);
		}
		
		return par;
	}

}
