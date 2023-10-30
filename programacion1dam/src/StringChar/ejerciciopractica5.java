package StringChar;

import java.util.Scanner;

/**
 * @author santi
 * Esta es la unica clase de mi programa
 */

public class ejerciciopractica5 {

	/**
	 * Este metodo es el punto de entrada de mi programa
	 * @param args
	 */
	public static String invertir (String cadena) {

		return new StringBuilder(cadena).reverse().toString();

	}
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un frase y te decimos si es un palíndromo");
		String n = sc1.nextLine().toLowerCase();
		String invert = invertir(n);
		
		if (n.equals(invert)) 
			System.out.println("Es un palíndromo");
		
		else 
			System.out.println("No es un palíndromo");
		
	}

}
