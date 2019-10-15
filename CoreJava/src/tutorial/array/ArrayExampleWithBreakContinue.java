package tutorial.array;

import java.util.Scanner;

public class ArrayExampleWithBreakContinue {

	public static void main(String[] args) {
		
		int numbers[] = {1,2,3,40,5,6,7,8,9,3,88};
		
		for(int i = 0 ; i < numbers.length; i++) {
			if(numbers[i] == 40)
				continue;
			System.out.print(numbers[i] +" ");
		}
		
		
		
	}

}
