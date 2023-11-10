package ArrayDoble;

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

		int[][] matriz1 = {
	            {85, 47, 31},
	            {24, 86, 92},
	            {151, 3, 88}
	        };
		
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			
			double suma = 0;
			double cantidad = 0;
			
			for (int j = 0; j < matriz1.length; j++) {
				
				suma += matriz1[i][j];
				cantidad++;
			}
			
			double promedio = suma / cantidad;
			System.out.println("Este es el promedio de cada fila: " + promedio);
			
		}
		
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			
			double suma = 0;
			double cantidad = 0;
			
			for (int j = 0; j < matriz1.length; j++) {
				
				suma += matriz1[j][i];
				cantidad++;
			}
			
			double promedio = suma / cantidad;
			System.out.println("Este es el promedio de cada columna: " + promedio);
			
		}
		
	 }
}
