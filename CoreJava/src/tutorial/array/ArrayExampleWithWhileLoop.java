package tutorial.array;

import java.util.Scanner;

public class ArrayExampleWithWhileLoop {

	public static void main(String[] args) {
		
		int numbers[] = {};
		
		System.out.println("Size of Numbers Array "+ numbers.length);
		for(int i = 0 ; i < numbers.length; i++) {
			System.out.print(numbers[i] +" ");
		}
		
		System.out.println(System.lineSeparator());
		
		// Enhanced For loop
		for(int i : numbers) {
			System.out.print(i +" ");
		}
		
		System.out.println("Using While Loop");
		int j = 0;
		while(j < numbers.length) {
			System.out.print(numbers[j++] +" <> ");
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("Do While Loop");
		int k = 0;
		do {
			System.out.print(numbers[k++] +" <> ");
		} while (k < numbers.length);
	}

}
