package tutorial.exceptions;

import tutorial.inheritance.Elephant;

import java.util.Scanner;

public class ExceptionsDriver2 {
    public static void main(String[] args) {
        System.out.println("I have stared the program...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Value");
        int value1 = scanner.nextInt();

        System.out.println("Enter Second Value");
        int value2 = scanner.nextInt();

        System.out.println("Division of both value is ");

        int result;
//        System.out.println(result); // using it without initilizing...
        try{
            result = value1/value2;
        }catch (Exception exp){
            exp.printStackTrace();
            result = 3;
            System.out.println("The default result value is 3");
        }

        System.out.println("Result of the division is "+ result);

        System.out.println("Enter third value for addition");
        int value3 = scanner.nextInt();

        int additionValue = result+value3;
        System.out.println("Final value after addition " + additionValue);

        System.out.println("This is the finish...");
    }

}
