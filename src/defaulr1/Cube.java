package defaulr1;

public final class Cube {
	int a;
	int b;
	int c;
	public final int number; 
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getVolume() {
		return a * b * c; 
	}
	
	Cube() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
		this.number = 8;
	}
	
	Cube(int a, int b, int c) {
		this.number = 8;
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
