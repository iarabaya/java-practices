package exercises;

public class Ejercicio05e {

	public static void main(String[] args) {
		float num = Float.valueOf(args[0]);
		float abs = num > 0 ? num : - num;
		System.out.println("el absoluto de " + num + " es " + abs);
	}

}
