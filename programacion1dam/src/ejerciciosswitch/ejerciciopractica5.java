package ejerciciosswitch;

import java.util.Scanner;

public class ejerciciopractica5 {

	public static void main(String[] args) {

		System.out.println("Ingrese su calificación (Del 1 al 5)");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Suspenso");
			break;
		case 2:
			System.out.println("Suspenso");
			break;
		case 3:
			System.out.println("Aprobado");
			break;
		case 4:
			System.out.println("Notable");
			break;
		case 5:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Esa opción no existe");
		}

	}

}
