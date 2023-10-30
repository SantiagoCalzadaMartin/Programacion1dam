package StringChar;

import java.util.Scanner;

/**
 * @author santi
 * Esta es la unica clase de mi programa
 */

public class ejerciciopractica6 {

	/**
	 * Este metodo es el punto de entrada de mi programa
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.out.println("introduce una frase para cambiar la letra que tu quieras por la letra que tu quieras");
        Scanner sc1 = new Scanner(System.in);
        String n = sc1.nextLine().toLowerCase();

        System.out.println("Caracter a cambiar");
        Scanner sc2 = new Scanner(System.in);
        String o = sc2.nextLine().toLowerCase();
        
        System.out.println("Caracter resultante");
        Scanner sc3 = new Scanner(System.in);
        String w = sc3.nextLine().toLowerCase();
        
        String updatedString = n.replace(o, w);
        System.out.println(updatedString);
        
        sc1.close();
        sc2.close();
        sc3.close();
	}

}
