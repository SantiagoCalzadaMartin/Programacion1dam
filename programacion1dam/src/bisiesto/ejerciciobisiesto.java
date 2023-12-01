package bisiesto;

import java.util.Scanner;

public class ejerciciobisiesto {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduzca un año y te diré si es bisiesto o no lo es:");
		int n = sc1.nextInt();
				
		if(n % 100 == 0 && n % 400 == 0) {
			System.out.println("El año " + n + " es bisiesto.");
		}
		
		else if (n % 4 == 0) {
			System.out.println("El año " + n + " es bisiesto.");
		}
		
		else {
			System.out.println("El año " + n + " no es bisiesto.");
		}

	}

}
