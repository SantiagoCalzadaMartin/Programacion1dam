package StringChar;

import java.util.Scanner;

/**
 * @author santi
 * Esta es la unica clase de mi programa
 */

public class ejerciciopractica4 {

	/**
	 * Este metodo es el punto de entrada de mi programa
	 * @param args
	 */
	
	public static String invertir (String cadena) {

		return new StringBuilder(cadena).reverse().toString();

	}
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println();
		String n = sc1.nextLine();
		String invert = invertir(n);
		System.out.println(invert);
		sc1.close();
		
	}

}
