package ejerciciosfor;

import java.util.Scanner;

public class ejerciciopractica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce una tabla de multiplicar:");
		n = sc1.nextInt();
		
		for(int i =1; i <= 10; i++){
			System.out.println(n*i);
		}
		sc1.close();
	}

}
