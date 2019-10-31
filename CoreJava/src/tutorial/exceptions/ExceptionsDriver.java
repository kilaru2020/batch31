package tutorial.exceptions;

import tutorial.inheritance.Elephant;

public class ExceptionsDriver {
    public static void main(String[] args) {
        System.out.println("I have stared the program...");

        int age = 10;
        int height = 20;
        int formulaValue = findFormula(age, height);

        int selectionCriteriaValue = 0;
        try{
            selectionCriteriaValue = age/0;
        }catch (Exception exp) {
            selectionCriteriaValue = 1;
        }

        Elephant elephant = new Elephant(4,"","");

        if(elephant != null) {
            System.out.println(elephant.getName());
        }

        /*try{
            System.out.println(elephant.getName());
        }catch (Exception exp){
            System.out.println("I am in the catch block...");
        }*/

                ///selectionCriteria(age, 0);
        if(selectionCriteriaValue > 1) {
            System.out.println("This person is selected...");
        }else {
            System.out.println("This person is not selected....");
        }

        System.out.println(formulaValue);
        System.out.println("This is the finish...");
    }

    public static int selectionCriteria(int age , int someValue){
        return age/someValue;
    }
    public static int findFormula(int age , int height) {
        return age + height;
    }
}
