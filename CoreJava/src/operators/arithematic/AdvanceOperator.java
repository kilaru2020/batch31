package operators.arithematic;

public class AdvanceOperator {

	public static void main(String[] args) {
//		int age = 10;
//		System.out.println("age in 2017 =" + age);
//		age++;
//		System.out.println("age 2018 =" + age);
//		//age++;
//		System.out.println("age 2019 =" + age);
		// Post Increment
		int age = 10;
		System.out.println("age in 2017 =" + age++); //10 -> 11
		System.out.println("age 2018 =" + age++); // 11 -> 12
		System.out.println("age 2019 =" + age); // 12 -> 13
		
		System.out.println(System.lineSeparator());
		// Pre increment
		int height = 2;
		System.out.println("height  Jan =" + ++height);
		System.out.println("Height April =" + ++height);
		System.out.println("Height July =" + height);
		
	}

}
