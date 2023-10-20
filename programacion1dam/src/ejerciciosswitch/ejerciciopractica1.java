package ejerciciosswitch;

import java.util.Scanner;

public class ejerciciopractica1 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese el número del día de la semana que quieras:");
		int n = sc1.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("No hay días de la semana que correspondan a " + n);
		
		
		}
		
	}

}
