package exercises;
/* Imprime por pantalla todos los argumentos que recibas. 
 * Si el argumento tiene menos de 5 caracteres, escríbelo en mayusculas.
 * Sino en minusculas
 * */

public class Ejemplo06a {
	private static final int LIM = 5;

	public static void main(String[] args) {
		for(String s: args) {
			if(s.length() < LIM) {
				System.out.println(s.toUpperCase());
			}else {
				System.out.println(s.toLowerCase());
			}
		}
	}
}
