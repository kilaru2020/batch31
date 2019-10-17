package tutorial.methods;
/*
 * Pass the array as an argument to the calculateSum method. 
 * So, you have to change the signature of the calculateSum method also.
 * And do the same for loop and either print it or return the sum and display.
 */
public class MethodExample {

	public static void main(String[] args) {
		
	
		int numbers[] = {1,2,3,4};
		
		int sum = 0; // local 
		for(int num : numbers) {
			sum +=num; // sum = sum + num;
		}
		
		System.out.println("Sum of the array of Numbers = "+ sum);
		
		
		int ages[] = {10,20,4,90,60};
		sum = 0;
		for(int num : ages) {
			sum +=num; // sum = sum + num;
		}
		System.out.println("Sum of the array of Age Numbers = "+ sum);
		
	}
	
	// Methods which either returns something or nothing
	public void calculateSum() {
		
	}
	

}
