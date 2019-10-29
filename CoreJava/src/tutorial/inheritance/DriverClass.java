package tutorial.inheritance;

public class DriverClass {
    public static void main(String[] args) {
        Tiger tiger = new MountainTiger(4, "Bengal Tiger", "WB",-3);
        System.out.println(tiger.getNoOfLegs());
        System.out.println(tiger.getName());
        System.out.println(tiger.getPlace());

//        tiger.setJumpingLevel("HIGH");
//        tiger.noiseLevel();
//        tiger.getJumpingLevel();
//        tiger.getStripWidth();

//        Animal elephant = new Animal(4, "Elephant", "Africa");

        MountainTiger mountainTiger = new MountainTiger("White Mountain", -30);
        MountainTiger mountainTiger1 = new MountainTiger(4, "MT", "Indian Mountain", -25);

        Animal mountainTiger2 = new MountainTiger("Chines Mountains", -45);
        // You can refer a subclass using the reference of a super class.
    }
}
