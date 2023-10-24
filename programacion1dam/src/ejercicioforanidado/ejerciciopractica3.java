package ejercicioforanidado;

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
		
		int n1 = 1;
		
		for ( int f = 1; f <= 10; f++ ) {
			System.out.print(f);
			for ( int c = 1; c <= 10; c++ ) {
				n1 = c * f;
				System.out.print(" " + n1);
			}
			System.out.println(" ");
		}
		
	}

}
