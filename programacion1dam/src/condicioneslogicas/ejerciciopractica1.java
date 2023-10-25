package condicioneslogicas;

import java.util.Scanner;

/**
 * @author santi
 * Esta es la unica clase de mi programa
 */

public class ejerciciopractica1 {
	/**
	 * Este metodo es el punto de entrada de mi programa
	 * @param args
	 */
	
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("¿Cuantos lados iguales tiene tu triángulo?");
		int n = sc1.nextInt();
		
		if (n == 0 || n == 1) {
			System.out.println("Tu triángulo es escaleno");
		}
		else if (n == 2) {
			System.out.println("Tu triángulo es isósceles");
		}
		else if (n == 3) {
			System.out.println("Tu triángulo es equilátero");
		}
		else {
			System.out.println("Los triángulos tienen tres lados");
		}

	}

}
