package tutorial.inheritance;

public class Elephant extends Animal implements Attacking {

    public Elephant(int noOfLegs, String name, String place) {
        super(noOfLegs, name, place);
    }

    public void noiseLevel() {
        System.out.println("Level is Very High...");
    }

    @Override
    public void foodHabits() {
        System.out.println("I eat only veggie....");
    }

    public void migration(){
        System.out.println("Elephants migrate all the time ....");
    }

    @Override
    public void attack() {
        System.out.println("I attack when i feel dangerous");
    }
}
