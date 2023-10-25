package condicioneslogicas;

import java.util.Scanner;

/**
 * @author santi
 * Esta es la unica clase de mi programa
 */

public class ejerciciopractica3 {
	/**
	 * Este metodo es el punto de entrada de mi programa
	 * @param args
	 */
	
	public static void main(String[] args) {

		System.out.println("Ingrese tres números y averigua si esta en orden creciente, decreciente o en ninguno de los dos");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int k = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		int j = sc3.nextInt();

		if (n < k && k < j) {
			
			System.out.println("Esta en orden creciente");
			
		}
		
		else if (n > k && k > j) {
			
			System.out.println("Esta en orden decreciente");
			
		}
		
		else {
			
			System.out.println("No esta en ningún orden");
			
		}
		
	}

}
