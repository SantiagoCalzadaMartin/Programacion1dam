package ejercicio1;

public class A3 {
	private int numero1;
	private int numero2;
	
	public A3 (int x, int y) {
		this.numero1 = x;
		this.numero2 = y;
	}
	
		public A3 clone() { 
			return new A3(
			this.numero1,
			this.numero2
			);
		}
}
