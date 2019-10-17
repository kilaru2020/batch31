package tutorial.methods;

public class MethodExample2 {

	public static void main(String[] args) {
		MethodExample2 me = new MethodExample2();
		int a = 60;
		me.sum(a,3);
		me.sum(34,55);
		me.sum(1, 2, 3);
		
	}
	/// Method Overloading
	// Methods which either returns something or nothing
	public void sum(int a , int b) {
		System.out.println("Sum of ("+a+"+ "+b+") = "+ (a+b));
	}

	public void sum(String a , int b) {
		System.out.println("Sum of ("+a+"+ "+b+") = "+ (Integer.parseInt(a)+b));
	}
	
	public void sum(int a, int b , int c) {
		System.out.println("Sum of (a+b+c) = "+ (a+b+c));
	}
	public void sum(int a, int b , int c, int d) {
		System.out.println("Sum of (a+b+c) = "+ (a+b+c+d));
	}
}
