package ejercicio1;

public class Main {

	public static void main(String[] args) {

		A3 a = new A3(3,6);
		A3 a2 = a.clone();
		A3 a3 = a;
		A2 b = new A2('x',a);
		A2 b2 = b.clone();
		A2 b3 = b;
		A1 c = new A1(3,a,b);
		A1 c2 = c.clone();
		
		if(a.equals(a2)) {
			System.out.println("Verdadero");
		}
		else {
			System.out.println("Falso");
		}

	}

}
