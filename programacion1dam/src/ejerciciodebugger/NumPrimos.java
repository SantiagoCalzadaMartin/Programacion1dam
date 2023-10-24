package ejerciciodebugger;
import java.util.Scanner;

//usando un bucle while quiero que recorra los 10.000 primeros numeros y caudno detectemos
// un primo numero, se imprima por pantalla, ademas imprimir que posicion nº primo es


public class NumPrimos {

	public static void main(String[] args) {
		int i = 2;
        int cont = 1;

        while (i <= 10000) {
            int Primo = 1;

            for (int h = 2; h * h <= i; h++) {
                if (i % h == 0) {
                    Primo = 0;
                    break;
                }
            }

            if (Primo == 1) {
                System.out.println("El " + cont + "º " + "número primo es el " + i);
                cont++;
            }

            i++;
        }
    }
}
