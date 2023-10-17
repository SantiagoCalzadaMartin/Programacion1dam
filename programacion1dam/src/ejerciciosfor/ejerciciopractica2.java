package ejerciciosfor;

import java.util.Scanner;

public class ejerciciopractica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int N;
		int numero=1;
		int suma=0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un número:");
		N = sc1.nextInt();
		
		for(numero=1;numero<(N+1);numero++) {
		
			if ((numero%2) == 0) {	
				System.out.println("números par " + numero);
				suma = suma + numero;
			}
			
		}
		System.out.println("La suma total es " + suma);
	}

}
