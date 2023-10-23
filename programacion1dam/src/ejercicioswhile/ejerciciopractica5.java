/**
 * Utilizando un bucle while, haz que recorra los 10000 primero números y cuando detecteis un número divisible entre 2 y 3 que lo
imprima por pantalla, además, que imprima que posición de número primo es.

ej el 1 numero primo es 2
 */
package ejercicioswhile;

/**
 * Este metodo es el punto de entrada de mi programa
 * @param args
 */
public class ejerciciopractica5 {
	 /**
	  * Este metodo es el punto de entrada de mi programa
	  * @param args
	  */
	public static void main(String[] args) {
/**
 * Estas son las variables de mi programa
 * @param args
 * 
 */
		int n = 2;
		int cont = 1;
		int limite = 10000;		
		
		
/**
 * Este es el codigo de mi programa
 * @param args
 */

		while(n <= limite) {
			
			if (n % 2 == 0 && n % 3 == 0) {
				
				System.out.println("El " + cont + "º " + "número divisible entre 2 y 3 es " + n );
				cont++;
				n++;
				
			}		
		}
	}
}
