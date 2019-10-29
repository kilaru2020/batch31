package tutorial.inheritance;

public class OverrideDriver4 {
    public static void main(String[] args) {
        Animal mountainTiger = new MountainTiger("White Mountain", -30);
//        Animal mountainTiger = new JungleHumanBeing("White Mountain", -30);
        printDetails(mountainTiger);
        System.out.println(System.lineSeparator());

        Animal elephant = new Elephant(4, "Airavat", "India");
        printDetails(elephant);
    }

    public static void printDetails(Animal animal) {
        System.out.println("*************");
        animal.noiseLevel();
        animal.swimmingCapability();
        System.out.println("*************");
    }



}
