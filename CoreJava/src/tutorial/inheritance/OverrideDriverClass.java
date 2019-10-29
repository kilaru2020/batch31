package tutorial.inheritance;

public class OverrideDriverClass {
    public static void main(String[] args) {
        Animal mountainTiger = new MountainTiger("White Mountain", -30);
        mountainTiger.noiseLevel();

//        mountainTiger.mountainTigerVisibilityRatio(); // ClassCast


        Elephant elephant = new Elephant(4,"Airavat","India");
        elephant.noiseLevel();
    }



}
