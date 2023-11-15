package main;

public class A1 {
	
	private int n;
	private B b;



	public A1 (int n, B b) {
		
		this.n = n;
		this.b = b;
		
	}
	
	public boolean equals(A1 a) {
		
		return(
				
				this.n == a.n &&
				this.b.equals(a.b)
				
				);
		
	}
}
