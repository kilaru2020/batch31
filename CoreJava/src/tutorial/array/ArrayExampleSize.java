package tutorial.array;

public class ArrayExampleSize {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,555}; // Compile time errors
		System.out.println(numbers[4]); 
//		System.out.println(numbers[5]); // Runtime Exception
		// ArrayIndexOutOfBoundsException
		numbers[4] = 5;
		System.out.println(numbers[4]);
		
		numbers[5] = 5;
		
	}
	
}
