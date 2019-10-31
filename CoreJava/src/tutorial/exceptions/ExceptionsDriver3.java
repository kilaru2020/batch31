package tutorial.exceptions;

import java.util.Scanner;

public class ExceptionsDriver3 {
    public static void main(String[] args) {
        System.out.println("I have stared the program...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Value");
        int value1 = scanner.nextInt();

        System.out.println("Enter Second Value");
        int value2 = scanner.nextInt();

        System.out.println("Division of both value is ");

        int result;
        try{
            result = divide(value1,value2); // caught exceptions...
            result = divideAgain(value1,result);

        }catch(MyOwnException exp){
            exp.printStackTrace();
            result = 5;
        }catch (Exception exp){
            exp.printStackTrace();
            result = 3;
        }finally {
            System.out.println("This is finally block...");
        }
        int i = divideMeAgain(value2, result); // Un-Caught exceptions....

        System.out.println("Result of the division is "+ result);

        System.out.println("Enter third value for addition");
        int value3 = scanner.nextInt();

        int additionValue = result+value3;
        System.out.println("Final value after addition " + additionValue);

        System.out.println("This is the finish...");
    }


    public static int divide(int value1, int value2) throws Exception {
        if(value2 == 0) {
            throw new IllegalArgumentException("Please pass proper value instead of "+ value2);
        }
        return value1/value2;
    }


    public static int divideAgain(int value1, int value2) throws MyOwnException {
        if(value2 == 0) {
            throw new MyOwnException("Please pass proper value here..");
        }
        return value1/value2;
    }

    public static int divideMeAgain(int value1, int value2) throws RuntimeException {
        if(value2 == 0) {
            throw new RuntimeException("Please pass proper value here..");
        }
        return value1/value2;
    }


}

class Utility {
    public static int divide(int value1, int value2) {
        return value1/value2;
    }
}
