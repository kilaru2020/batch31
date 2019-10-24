package tutorial.classes;
//import java.lang.Math;
/*
Try calling static method from a non-static method.
try calling non-static method from a static method
 */
public class JavaVariables {
    public String exampleType;

    public static void main(String[] args) {
        int count = 10;
        callMe();

        System.out.println("Company Name "+ Constant.companyName);

    }

    public static void callMe(){
        System.out.println("hello This is from Static Method");
    }

    public void callMeAgain(){
        // callMe();
    }


}


class Purse{
    public String name;
    public String type;
    public int totalCapacity;

    public static int totalCount;
}

class Constant {
    public final static String companyName = "H2kInfosys";
}