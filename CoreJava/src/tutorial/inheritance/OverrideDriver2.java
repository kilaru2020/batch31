package tutorial.inheritance;

public class OverrideDriver2 {
    public static void main(String[] args) {
        Animal mountainTiger = new MountainTiger("White Mountain", -30);
        printNoiseLevel(mountainTiger);

        Elephant elephant = new Elephant(4,"Airavat","India");
        printNoiseLevel(elephant);
    }

    /**
     *
     */
    public static void printNoiseLevel(Animal animal) {
        System.out.println("******************");
        animal.noiseLevel();
        System.out.println("******************");
    }
//
////    /**
////     *
////     */
//    public static void printNoiseLevelEle(Elephant elephant) {
//        System.out.println("******************");
//        elephant.noiseLevel();
//        System.out.println("******************");
//    }

}
