package ejercicio1;

public class A1 {
	private int num;
	private A3 a;
	private A2 b;
	
	public A1 (int x, A3 a, A2 b) {
		this.num = x;
		this.a = a;
		this.b = b;
	}
	
	public boolean equals(A1 c) {
		return(
				this.num == c.num &&
				this.a.equals(c.a) &&
				this.b.equals(c.b)
				);
	}
	public A1 clone() {
        return new A1(
                this.num,
                this.a.clone(), 
                this.b.clone()
                );
    }
}
