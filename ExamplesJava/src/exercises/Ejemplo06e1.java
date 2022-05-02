package exercises;

public class Ejemplo06e1 {

	private static final String FIN = "fin";
	
	public static void main(String[] args) {
		System.out.println("Se han recibido " + args.length + " argumentos.");
		
		int i = 0;
		do {
			System.out.println(i + ") " + args[i]);
			i++;
		}while(!args[i].equals(FIN) && i < args.length);
		System.out.println("\"fin\" estaba en la posicion nº " + i);
	}

}
