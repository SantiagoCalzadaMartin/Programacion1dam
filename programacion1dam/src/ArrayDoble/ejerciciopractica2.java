package ArrayDoble;

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
		
		int[][] matriz1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int filas = matriz1.length;
	        int columnas = matriz1.length;
	        
	        System.out.print("Matriz original");
	        for (int i = 0; i < filas; i++) {
				System.out.print("\n");
				for (int h = 0; h < columnas; h++) {
					System.out.print(matriz1[i][h] + " ");
				}
	        }
	        System.out.println("\n" );
	        
	        System.out.print("Matriz resultante");
	        for (int i = 0; i < filas; i++) {
				System.out.print("\n");
				for (int h = 0; h < columnas; h++) {
					System.out.print(matriz1[h][i] + " ");
				}
	        }

		
	}

}
