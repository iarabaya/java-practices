package exercises;
/*
 * Listar todos los argumentos pero mostrando su posicion
 */

public class Ejemplo06c {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			String s = args[i];
			System.out.println(i + ") " + s);
		}
		
		//con for each
		int i = 0;
		for( String s : args) {
			System.out.println(i + ") " + s);
			i++;
		}
	}
}
