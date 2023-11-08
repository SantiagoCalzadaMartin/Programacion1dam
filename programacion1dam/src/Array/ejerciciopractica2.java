package Array;

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
		
		int n[];
		int par = 0;
		int impar = 0;
		n = new int[10];


		for (int i=0;i< n.length ;i++) {
			if(i % 2 == 0) {
				par++;	
			}else {
				impar++;	
			}
		}
		System.out.println("Hay " + par + " numeros pares" );
		System.out.println("Y hay " + impar + " numeros impares");
	}

}
