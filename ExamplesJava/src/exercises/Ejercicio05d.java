package exercises;

/* 
 * Escribe un programa que reciba el numero de mes y devuelva el numero de dias que tiene. 
 *  Ignora los años bisiestos. Solo debes hacer algo si recibes 1 solo parametro.
 */

public class Ejercicio05d {

	public static void main(String[] args) {
		if(args.length == 1) {
			int mes = Integer.valueOf(args[0]);
			if(mes < 1 || mes > 12) {
				System.err.println(mes + " no es un mes válido.");
			} else {
				int dias = calculaDias(mes);
				System.out.println("El mes "+ mes + " tiene " + dias + " dias.");
			}
		}
	}
	
	private static int calculaDias(int mes) {
		int dias;
		switch (mes) {
		case 2:
			System.out.println("Febrero");
			dias = 28;
			break;
		case 4:
			System.out.println("Abril");
		case 6:
			System.out.println("Junio");
		case 9:
			System.out.println("Septiembre");
		case 11:
			System.out.println("Noviembre");
			dias = 30;
			break;
		default:
			System.out.println("Mes de los largos");
			dias = 31;
			break;
		}
		return dias;
	}
}
