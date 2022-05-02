package exercises;

public class Ejemplo06e2 {

	private static final String FIN = "fin";
	
	public static void main(String[] args) {
		
		if(args.length != 0) {
			System.out.println("Se han recibido " + args.length + " argumentos.");
			
			int i = 0;
			String palabra;
			do {
				palabra = args[i];
				System.out.println(i + ") " + palabra);
				i++;
			}while(!palabra.equals(FIN) && i < args.length);
			System.out.println("\"fin\" estaba en la posicion nº " + i);			
		}else {
			System.out.println();
		}
	}
}
