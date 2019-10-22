package tutorial.classes;

public class DriverProgram {

	public static void main(String[] args) {
		Address manifacturer_1 = new Address();
		manifacturer_1.country = "China";
		manifacturer_1.state = "SomeState";
		
		
		Phone samsung = new Phone();
		samsung.name = "Samsung";
		samsung.model = "Model 1";
		samsung.size = 7;
		samsung.color = "Blue";
		
		samsung.manifactureAddress = manifacturer_1;
		
		
		PhonePen pen = new PhonePen();
		pen.size = 5;
		samsung.pen = pen;
		
		System.out.println("Samsung name "+ samsung.name);
		System.out.println("Samsung size "+ samsung.size);
		
		System.out.println("Samsung Address "+ samsung.manifactureAddress.country);
		
		
//		
		Phone iphone = new Phone();
		iphone.name = "Iphone";
		iphone.model = "X";
		iphone.size = 6;
		iphone.color = "Black";
		iphone.manifactureAddress = manifacturer_1;

//		Address iphoneManifacturer = new Address();
//		iphoneManifacturer.manifactureAddressCountry = "China";
//		iphoneManifacturer.manifactureAddressState = "SomeState";
//
//		System.out.println("Phone name "+ samsung.name +" Color : "+ samsung.color +" Model "+ samsung.model);
//		samsung.model = "Model 2";
//		System.out.println("Phone name "+ samsung.name +" Color : "+ samsung.color +" Model "+ samsung.model);
//		
//		System.out.println("Samsung Manifacturer ="+ samsung.manifactureAddress);
//		
//		System.out.println("Phone name "+ iphone.name  +" Color : "+ iphone.color +" Model "+ iphone.model);
		
	}

}

// Template
class Phone {
	String name; // instance variables: inside a class but outside the method
	String model;
	int size;
	String color;
	
	Address manifactureAddress;
	PhonePen pen;
	
}
class PhonePen{
	int size;
}

