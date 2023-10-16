package ifelse;

import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduzca un número entre el 1 y el 100");
		int numero = sc1.nextInt();
		
		if (numero>=1 && numero<=100) {
			System.out.println(numero);
	}
		else {
			System.out.println("Te dije un número entre el 1 y el 100 bobo");
		}
	}
}
