package tutorial.array;

public class ArrayExampleDefaultValue {

	public static void main(String[] args) {
		//defualt value is zero for int , 0.0 for floating type
		// numbers
		int _1 = 100; 
		int _2 = 2;
		int _3 = 3;
		int _4 = 4;
		int _5 = 5;
		
		int numbers[] = new int[7];
		numbers[0] = _1;
		numbers[1] = _2;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[6]);
		
	}

}
