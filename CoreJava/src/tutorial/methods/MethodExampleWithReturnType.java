package tutorial.methods;

public class MethodExampleWithReturnType {

	public static void main(String[] args) {
		MethodExampleWithReturnType me = new MethodExampleWithReturnType();
		
		int ages[] = {20,30};
		int sumAges = me.sum(ages[0],ages[1]);
		
		int heights[] = {5,6};
		int sumHeight= me.sum(heights[0],heights[1]);
		
		System.out.println("Difference is "+ (sumAges+sumHeight));
		System.out.println("Addition is "+ me.sum(sumAges,sumHeight));
		
	}
	public int sum(int a , int b) {
		System.out.println("Sum of ("+a+"+ "+b+") = "+ (a+b));
		return a+b;
	}
}
