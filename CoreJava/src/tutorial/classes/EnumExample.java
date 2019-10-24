package tutorial.classes;

import tutorial.classes.pojo.Worker;

public class EnumExample {
    public static void main(String[] args) {
        drinkCoffee(Coffee.SMALL);
        System.out.println(Month.JAN.getValue());
    }

    /**
     *
     * @param size
     */
    /*
    public static void drinkCoffee(String size){
        if(size == "Small") {
            System.out.println("Prepare Small Size");
        }else if(size.equals("Medium")){
            System.out.println("Prepare Medium Size");
        }else if(size.equals("Large")){
            System.out.println("Prepare Large Size");
        }
    }*/

    public static void drinkCoffee(Coffee coffee){
        if(coffee == Coffee.SMALL) {
            System.out.println("Prepare Small Size");
        }else if(coffee == Coffee.MEDIUM){
            System.out.println("Prepare Medium Size");
        }else if(coffee == Coffee.LARGE){
            System.out.println("Prepare Large Size");
        }
    }
}
enum Coffee{
    SMALL, MEDIUM,LARGE;
}

enum Month {
    JAN(1),FEB(2),MARCH(3), DEC(12);

    private int value;
    Month(int i){
        this.value = i;
    }

    public int getValue(){return this.value;}
}


