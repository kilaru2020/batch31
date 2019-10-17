package operators.arithematic;

public class LoopWithSwitch {

	public static void main(String[] args) {

		int monthNumber = 0;

		for (int i = 0; i < 1000; i++) {

			monthNumber = i;
			if (monthNumber == 1) {
				System.out.println("JAN");
			} else if (monthNumber == 2) {
				System.out.println("FEB");
			} else if (monthNumber == 3) {
				System.out.println("MARCH");
			} else if (monthNumber == 4) {
				System.out.println("APRIL");
			} else if (monthNumber == 5) {
				System.out.println("MAY");
			} else {
				System.out.println("Not Sure...");
			}

		}

		for (int i = 0; i < 1000; i++) {

			monthNumber = i;
			switch (monthNumber) {
			case 1:
				System.out.println("JAN");
				break;
			case 2:
				System.out.println("FEB");
				break;
			case 3:
				System.out.println("MARCH");
				break;
			case 4:
				System.out.println("APRIL");
				break;
			case 5:
				System.out.println("MAY");
				break;
			default:
				System.out.println("Not Sure...");
				break;
			}

		}
	}
}
