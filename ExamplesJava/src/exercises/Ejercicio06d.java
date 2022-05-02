package exercises;

/* Indica la posicion del primer argumento que sea una palabra demasiado larga (+10 caracteres)
 * <<La x palabra es demasiado larga>> o <<Todas las palabras son correctas>>,
 *  si no hay ninguna de mas de 10 
 */

public class Ejercicio06d {

	private static final int LIM = 10;
	public static void main(String[] args) {
		int i = 0;
		boolean encontrada = false;
		
		while (i < args.length && !encontrada) {
			encontrada = args[i].length() > LIM;
			i ++;
		}
		
		if(encontrada) {
			System.out.println("La " + i + "ª palabra es demasiado larga.");
		}else {
			System.out.println("Todas las palabras son correctas");
		}
	}

}
