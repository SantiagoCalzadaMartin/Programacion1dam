package ejerciciosswitch;

import java.util.Scanner;

public class ejerciciopractica2 {

	public static void main(String[] args) {

		double res;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingresae un número");
		int n = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduzca un operador de + - * / ");
		char N = sc2.next().charAt(0);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Introduzca el segundo número");
		int n2 = sc3.nextInt();
		
		switch(N) {
		case '+':
			res = n + n2;
			System.out.println("El resultado es: " + res);
			break;
		case '-':
			res = n - n2;
			System.out.println("El resultado es: " + res);
			break;
		case '*':
			res = n * n2;
			System.out.println("El resultado es: " + res);
			break;
		case '/':
			if(n2 != 0) {
				res = n / n2;
				System.out.println("El resultado es: " + res);
			}
			else {
				System.out.println("Error: División por cero no permitida");
			}
			break;
			default:
				System.out.println("Operador no válido");
		
		}
		sc1.close();
		sc2.close();
		sc3.close();
		
	}

}
