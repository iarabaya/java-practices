package exercises;

/*
 * Lista todos los argumentos que recibas, pero cumpliendo las siguientes reglas: 
 * Si la palbra es corta (5 o menos caracteres),
 * la imprimes 4 veces en la misma linea,
 * y si es larga la repites solo dos veces
 *
*/

public class Ejercicio06c {
	private static final int LIM = 5;
	private static final int REP_CORTA = 4;
	private static final int REP_LARGA = 2;

	public static void main(String[] args) {
		for(String s : args) {
			if(s.length() <= LIM) {
				repitePalabras(REP_CORTA, s);
			}else {
				repitePalabras(REP_LARGA, s);
			}
		}
		
	}
	
	private static void repitePalabras(int repeticion, String palabra) {
		for (int i = 0; i < repeticion; i++) {
			System.out.print(palabra + " ");
		}
		System.out.println();
	}
}
