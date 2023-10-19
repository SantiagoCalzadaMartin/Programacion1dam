package ejercicioswhile;

import java.util.Scanner;

public class ejerciciopractica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un número:");
		int n = sc1.nextInt();
		int res = 0;

	
	while(n>0) {
		
		res++;
		n=n/10;
		
	}
	System.out.println("El número tiene " + res + " dígitos");
	}
}
