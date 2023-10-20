package ejerciciosswitch;

import java.util.Scanner;

public class ejerciciopractica3 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese su cantidad de dinero:");
		double n = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Ingrese su moneda en euros (E) o dólares (D)");
		char N = sc2.next().charAt(0);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("¿Quieres cambiar de moneda? si (Y) no (N)");
		char n2 = sc3.next().charAt(0);
		
		if(n2 == 'Y') {
			switch(N) {
			case 'E':
				n = n * 1.06;
				System.out.println("Tienes " + n + " Dólares");
				break;
			default:
				n = n / 1.06;
				System.out.println("Tienes " + n + " Euros");
			}
		}
		else {
			System.out.println("Tienes " + n + N);
		}
	}

}
