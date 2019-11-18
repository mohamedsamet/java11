package defaulr1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube();
		System.out.println(cube.getVolume());
		Cube cube1 = new Cube(5, 5, 6);
		System.out.println(cube1.getVolume());
		cube1.setA(100);
		System.out.println(cube1.getVolume());
		cube.setB(99);
		System.out.println(cube.getVolume());
		System.out.println(Add("1.3", "a55"));
	}
	
	public static int Add (int a, int b) {
		return a + b;
	}
	
	public static double Add (double a, double b) {
		return a + b;
	}
	
	public static String Add (String a, String b) {
		return a + b;
	}

}
