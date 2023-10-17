package ejerciciosfor;

import java.util.Scanner;

public class ejerciciopractica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int N;
		int suma=0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un número:");
		N = sc1.nextInt();
		
		for(int i=1;i<=N;i++) {
		
			if (i%2 == 0) {	
				System.out.println("números par " + i);
				suma = suma + i;
			}
			
		}
		System.out.println("La suma total de todos los pares de 1 hasta " + N + " es de " + suma);
	}

}
