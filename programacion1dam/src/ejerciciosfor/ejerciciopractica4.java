package ejerciciosfor;

import java.util.Scanner;

public class ejerciciopractica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	int n;
	int factorial = 1;
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Introduce un número entero positivo para factorizarlo:");
	n = sc1.nextInt();
		if(n>0) {
			for(int i=2; i<=n; i++) {
				factorial = i * factorial;
				System.out.println(factorial);
			}
		}
		else {
			System.out.println("Que dices payaso");
		}
	}

}
