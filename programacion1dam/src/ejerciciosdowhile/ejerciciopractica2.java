package ejerciciosdowhile;

import java.util.Scanner;

public class ejerciciopractica2 {

	public static void main(String[] args) {

		int i = 2;
		int suma = 0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese un número para hacer la suma de todos los números pares hasta su número");
		int n = sc1.nextInt();
		
		do {
            if(i % 2 == 0) {
                suma += i;
                System.out.println("Los numeros pares son " + i);
            }
            i++;
        }while(n >= i);

        System.out.println("La suma total de todos los pares de uno hasta " + n + " son " + suma);
		
	}

}
