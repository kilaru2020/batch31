package tutorial.inheritance;

public class AbstractExample {
    public static void main(String[] args) {
//        Animal animal = new Animal(4,"","");
        MountainTiger mountainTiger = new MountainTiger("White Mountain", -30);
        mountainTiger.foodHabits();
        Animal elephant = new Elephant(4,"Airavat","India");
        elephant.foodHabits();
    }
}
