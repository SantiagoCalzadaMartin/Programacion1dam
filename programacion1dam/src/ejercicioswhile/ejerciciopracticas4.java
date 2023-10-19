package ejercicioswhile;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejerciciopracticas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduzca un número del 1 al 100 para adivinarlo");
		int n = sc1.nextInt();
		
		while(n!=random) {
			
			n = sc1.nextInt();
			
				if(n<random) {
					
					System.out.println("El número es mayor a " + n );
					
				}
				
				else if(n>random) {
					
					System.out.println("El número es menor a " + n);
					
				}
				
				else if (n==random) {
			
					System.out.println("Felicidades, acertaste");
					
				}
		
		
		}
	}
}
