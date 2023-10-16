package ifelse;

import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduzca su año de nacimiento");
		int año1 = sc1.nextInt();
		int año2 = 2023;
		int resta = año2 - año1;
		
		if (año1>año2) {
			System.out.println("A donde vas tu flipado");
	}
		else {
			System.out.println("Tu edad es " + resta);
		}

	}
}
