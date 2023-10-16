package ifelse;

import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un número para comprobar si es par o impar");
		int numero = sc1.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("tu número es par");
		}
		else {
			System.out.println("tu número es impar");
		}

	}

}
