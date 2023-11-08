package ArrayDoble;

/**
 * @author santi
 * Esta es la unica clase de mi programa
 */

import java.util.Arrays;

public class ejerciciopractica1 {
	
	/**
	 * Este metodo es el punto de entrada de mi programa
	 * @param args
	 */
	
	  public static void main(String[] args) {
	        int[][] matriz1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matriz2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        int filas = matriz1.length;
	        int columnas = matriz1[0].length;

	        int[][] resultado = new int[filas][columnas];

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }

	        System.out.println("Matriz 1:");
	        mostrarMatriz(matriz1);

	        System.out.println("Matriz 2:");
	        mostrarMatriz(matriz2);

	        System.out.println("Suma de matrices:");
	        mostrarMatriz(resultado);
	    }
	  
		/**
		 * Este metodo es para la impresión de las matrices de mi programa
		 * @param args
		 */
	  
	  public static void mostrarMatriz(int[][] matriz) {
	        for (int[] fila : matriz) {
	            System.out.println(Arrays.toString(fila));
	        }
	    }
}