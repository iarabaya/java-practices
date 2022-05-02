package exercises;
public class TareaSimplificarIfs { // ya simplificado
	private static final String CANTA = "CANTA";
	private static final String LADRA = "LADRA";
	
	public static void main(String[] args) {
		boolean hayArgumentos = args.length > 0;
		
		if (!hayArgumentos) {
			System.err.println("No tengo argumentos");
			return;
		}
		
		int numArgumentos = args.length;
		String primerArgumento = args[0];
		
		if(primerArgumento.equals(CANTA)) {
			System.out.println("Un, dos, tres, un pasito palante María!");
		}else if(primerArgumento.equals(LADRA)) {
			boolean faltaNombre;
			String nombrePerro = "";
			faltaNombre = numArgumentos <= 1;
			if(!faltaNombre) {
				nombrePerro = args[1];
				System.out.println("bub bub bub");
				System.out.println("Hola " + nombrePerro);
			}else {
				System.out.println("Grr grr grr");
				System.out.println("No sé como te llamas");
			}
		
		}else {
			System.out.println("No se que quieres que haga");
		}
		
	}
}
