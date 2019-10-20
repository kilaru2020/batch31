package tutorial.classes;

public class DriverProgram2 {

	public static void main(String[] args) {
		Person tom = new Person();
		tom.name = "Tom";
		
		Address tomadd = new Address();
		tomadd.address1 = "Max Street";
		tomadd.country = "USA";
		tomadd.state = "NJ";
		
		tom.address = tomadd;
		
		tom.isMarried = true;
		
		Person roona = new Person();
		roona.name = "Roona";
		roona.address = tomadd;
		roona.isMarried = true;
		roona.spouse = tom;
		
		tom.spouse = roona;
		System.out.println("tom "+ tom.spouse.name);

		Person peter = null;

	}

}

class Person {
	
	String name;
	Address address;
	boolean isMarried;
	Person spouse;
	Person father;
	Person mother;
}
