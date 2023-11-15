package igualdad1;

public class igualdad1 {
	
		
		private int x;
		private int y;
		
			public igualdad1 (int x, int y) {
				this.x = x;
				this.y = y;
			}
			
			public boolean equals (igualdad1 a) {
				return (
					this.x == a.x &&
					this.y == a.y
				);
			}
			
	}

