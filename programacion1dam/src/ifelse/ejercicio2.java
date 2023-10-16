package ifelse;

import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int numero = sc1.nextInt();
		
		if (numero>0) {
			System.out.println("Positivo");
		}
		else if (numero<0) {
			System.out.println("Negativo");
	}
		else {
			System.out.println("Es 0");
		}

	}
}