package tutorial.inheritance;

public class OverrideDriver5 {
    public static void main(String[] args) {
//        Attacking mountainTiger = new MountainTiger("White Mountain", -30);
        Attacking mountainTiger = new JungleHumanBeing();
        printDetails(mountainTiger);

        System.out.println(System.lineSeparator());

        Attacking elephant = new Elephant(4, "Airavat", "India");
        printDetails(elephant);
    }

    public static void printDetails(Attacking attacking) {
        attacking.attack();
    }



}
