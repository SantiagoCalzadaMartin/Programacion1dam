package StringChar;

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

		System.out.println("Introduce una palabra y te diremos cuantos caractéres tiene:");
		Scanner sc1 = new Scanner(System.in);
		String n = sc1.next();
		int cont = 0;
		
		n = n.toLowerCase();	
		
        String[] i = n.split("a", -1);
        int k = i.length -1;

        System.out.println(k);
	}

}
