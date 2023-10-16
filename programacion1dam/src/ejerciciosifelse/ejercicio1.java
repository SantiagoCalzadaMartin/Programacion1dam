package ejerciciosifelse;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese su calificación del examen");
		int nota = sc1.nextInt();
		
		if (nota>=60) {
			
			System.out.println("Aprobado");
			
		}
		
		else {
			
			System.out.println("Suspendido");
			
		}
		
	}

}