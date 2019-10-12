package operators.relational;

public class RelationalOperator1 {

	public static void main(String[] args) {
		int tomAge = 10;
		int tomHeight = 5;
		
		int peterAge = 20;
		int peterHeight = 5;
		
		boolean isAgeEquals = (tomAge == peterAge);
		
		System.out.println("isAgeEquals = " + isAgeEquals);
		
		
		boolean canPeterPlayWithTom = peterAge >= tomAge;
		System.out.println("canPeterPlayWithTom = "+ canPeterPlayWithTom);
		

		boolean isPeterOlder = (peterAge > tomAge);
		System.out.println("isPeterOlder = "+ isPeterOlder);

		boolean isHeightMatches = peterHeight >= tomHeight; // 5 5
		System.out.println("isHeightMatches ="+ isHeightMatches);


		/// Can Peter and tom team up for Volleyball match
		// if peterIsOlder and heightmatches
		// then they can play volleyball together
		
		System.out.println("Can they play Volleyball together :"
				+ (isPeterOlder && isHeightMatches));

		// && || 
		
	}

}
