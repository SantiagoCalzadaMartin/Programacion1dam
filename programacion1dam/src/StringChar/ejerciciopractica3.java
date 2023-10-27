package StringChar;

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

		System.out.println("Introduce una palabra y te diremos cuantas vocales tiene:");
		Scanner sc1 = new Scanner(System.in);
		String n = sc1.nextLine();
		int cont = 0;
		
		n = n.toLowerCase();	
		
        String[] a = n.split("a", -1);
        String[] e = n.split("e", -1);
        String[] i = n.split("i", -1);
        String[] o = n.split("o", -1);
        String[] u = n.split("u", -1);
        int k = a.length -1;
        int l = e.length -1;
        int m = i.length -1;
        int p = o.length -1;
        int q = u.length -1;

        int suma = k + l + m + p + q;
        System.out.println(suma);

	}

}
