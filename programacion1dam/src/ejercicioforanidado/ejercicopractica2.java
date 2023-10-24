package ejercicioforanidado;

import java.util.Scanner;

/**
 * @author santi
 * Esta es la unica clase de mi programa
 */
public class ejercicopractica2 {
	 /**
	  * Este metodo es el punto de entrada de mi programa
	  * @param args
	  */

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un número para hacer un triángulo:");
		int n = sc1.nextInt();
		
		
		for ( int i = 0; i <= n; i++ ) {
			int k = 1;
			for ( int j = 1; j <= i; j++ ) {
				
				System.out.print(k);
				k++;
			}
			System.out.println("");
		}
	}
}
