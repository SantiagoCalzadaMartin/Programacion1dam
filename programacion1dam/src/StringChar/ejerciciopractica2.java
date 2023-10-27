package StringChar;

import java.util.Scanner;

/**
 * @author santi
 * Esta es la unica clase de mi programa
 */

public class ejerciciopractica2 {

	/**
	 * Este metodo es el punto de entrada de mi programa
	 * @param args
	 */
	
	public static void main(String[] args) {

		System.out.println("introduce una frase para cambiar todas las e por x");
        Scanner sc1 = new Scanner(System.in);
        String n = sc1.next();

        n = n.toLowerCase();

        char o = 'e'; // replacing character
        char nw = 'x'; // character to be replaced
        String updatedString = n.replace(o, nw);
        System.out.println(updatedString);

	}

}
