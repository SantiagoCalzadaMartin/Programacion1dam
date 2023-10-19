package ejerciciosdowhile;

import java.util.Scanner;

public class ejerciciopractica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int i = 1;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce una tabla de multiplicar:");
		n = sc1.nextInt();
		
		do{
			System.out.println(n*i);
			i++;
		}
		while(i <= 10) ;
		
	}

}
