package tutorial.inheritance;

public class OverrideDriver3 {
    public static void main(String[] args) {
        MountainTiger mountainTiger = new MountainTiger("White Mountain", -30);
//        printDetails(mountainTiger);
        printDetails(mountainTiger);
        System.out.println(System.lineSeparator());

        Animal elephant = new Elephant(4,"Airavat","India");
        printDetails(elephant);

//        float height = 5.5f;
//        int heightInt = (int)height;
//        System.out.println(heightInt);

    }

    /**
     *
     */
    public static void printDetails(Animal animal) {
        System.out.println("******************");
        animal.noiseLevel();
        System.out.println("******************");

        animal.swimmingCapability();

        if(animal instanceof Elephant) {
            Elephant elephant = (Elephant) animal;
            elephant.migration();
        } else if( animal instanceof MountainTiger) {
            MountainTiger mountainTiger = (MountainTiger) animal;
            mountainTiger.mountainTigerVisibilityRatio();
        }

        System.out.println("I am doing with Print Details...");
    }

}
