package tutorial;

public class Area {

	public static void main(String[] args) {
		// What is the Area of a Rectangle
		// Length * width * height
		
		int length = 7;
		int width = 5;
		int height = 4;
		
		String message = "Area of a Rectangle = ";
		System.out.println(message + (length*width*height));
		
		//formula say : given a line with length , divide that with the
		// length* width of the rectangle
		int lineLenth  = 7;
		
		float result =  (length*width)/lineLenth ;

		System.out.println(result);
	}
}