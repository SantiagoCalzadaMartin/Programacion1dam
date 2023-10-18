package ejercicioswhile;

import java.util.Scanner;

public class ejerciciopractica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un número:");
		int n = sc1.nextInt();
		int i = 1;
		
		while(i<=n) {
			
			System.out.println(i);
			
			i++;
		}
		
	}

}
