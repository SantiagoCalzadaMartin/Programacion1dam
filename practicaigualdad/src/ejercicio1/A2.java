package ejercicio1;

public class A2 {
	private char michar;
	private A3 a;
	
	public A2 (char x, A3 a) {
		this.michar = x;
		this.a = a;
	}
	
	public boolean equals(A2 b) {
		return(
				this.michar == b.michar &&
				this.a.equals(b.a)
				);
	}
	public A2 clone () {
        return new A2(
                this.michar,
                this.a.clone()
                );
	}
}
