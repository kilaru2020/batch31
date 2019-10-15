package operators.relational;

import java.util.Scanner;

public class RelationalOperatorWithCommandLineInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Forget about what I am doing..but you would figure out what is happening.. By Jayram 
		System.out.println("Enter Tom Age");
		int tomAge = scanner.nextInt();
		System.out.println("Enter Tom's Height");
		int tomHeight = scanner.nextInt();
		
		System.out.println("Enter Peter's Age");
		int peterAge = scanner.nextInt();
		
		System.out.println("Enter Peter's Height");
		int peterHeight = scanner.nextInt();
		
		boolean isPeterOlder = (peterAge > tomAge);
		boolean isHeightMatches = peterHeight >= tomHeight;
		
		if(isPeterOlder) {
			System.out.println("Peter is Older than Tom");
		}else {
			System.out.println("Tom is Yonger");
		}
		
		if(isHeightMatches) {
			System.out.println("Height is GOOD");
//			if(if your income is > 120K) {
//				
//			}else {
//				if(your income is between(inclusive) 105 and 107) {
//					
//				}
//			}
			
		}else {
			System.out.println("Height does not match");
		}
		
		boolean areTheyQualified = isPeterOlder && isHeightMatches;
		
//		if(areTheyQualified) {
//			System.out.println("They are qualified for Volleyball match");
//		}else {
//			System.out.println("They are disqualified...");
//		}
		
//		if(areTheyQualified) {
//			System.out.println("Qualified");
//		}else {
//			System.out.println("Disqualified");
//		}
		
		System.out.println(areTheyQualified ? "Qualified" : "Disqualified");
		
		
	}

}
