package exercises;

public class Ejemplo06d {
	private static final String FIN = "fin";

	public static void main(String[] args) {
		System.out.println("Se han recibido " + args.length + " argumentos.");
		
		int i = 0;
		while(i < args.length && !args[i].equals(FIN)) {
			System.out.println(i + ") " + args[i]);
			i++;
		}
		
		System.out.println("\"fin\" estaba en la posicion nº " + i);
	}
}
