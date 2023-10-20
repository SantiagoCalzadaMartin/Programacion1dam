package ejerciciosswitch;

import java.util.Scanner;

public class ejerciciopractica4 {

	public static void main(String[] args) {

		System.out.println("Elija entre las siguientes opciones:");
		System.out.println("(1) Mostrar información");
		System.out.println("(2) Editar perfil");
		System.out.println("(3) Salir");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Estás en mostrar información");
			break;
		case 2:
			System.out.println("Estás en editar perfil");
			break;
		case 3:
			System.out.println("FIN");
			break;
		default:
			System.out.println("Esa opción no existe");
		}
		
		
	}

}
