package condicioneslogicas;

import java.util.Scanner;
public class ejerciciopractica2 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese tres números y averigua cual es el mayor");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int k = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		int j = sc3.nextInt();

		if (n > k && n > j) {
			
			System.out.println("El mayor es " + n);
			
		}
		
		else if (k > n && k > j) {
			
			System.out.println("El mayor es " + k);
			
		}
		
		else if (j > n && j > k) {
			
			System.out.println("El mayor es " + j);
			
		}
	}

}
