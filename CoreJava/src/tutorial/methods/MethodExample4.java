package tutorial.methods;
/*
 * Pass the array as an argument to the calculateSum method. 
 * So, you have to change the signature of the calculateSum method also.
 * And do the same for loop and either print it or return the sum and display.
 */
public class MethodExample4 {

	public static void main(String[] args) {
		//Create an instance of MethodExample4
		MethodExample4 me = new MethodExample4();
		me.routineWork();
	}
	
	public void routineWork() {
		morningWork();
		officeWork();
		eveningWork();
	}
	
	public void morningWork() {
		System.out.println("Morning Work");
		System.out.println("Wake up, go for jog, eat breakfast.....");
		
	}
	
	public void officeWork() {
		System.out.println("Office Work");
		System.out.println("Drive to office...check emails...and do other stuff..");
	}
	
	public void eveningWork() {
		System.out.println("Evening Work");
		System.out.println("Go to dance.....");
	}
	
	

}
