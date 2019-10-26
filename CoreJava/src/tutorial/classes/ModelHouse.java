package tutorial.classes;
/*
    Inner classes can access all the instance variables of the outer class
 */
public class ModelHouse {

    private ModelKitchen kitchen;
    String livingRoomColor;

    private class ModelKitchen {
        String kitchenDeck;
        String kitchenLights;
        String kitchenAppliances;
        String kitchenColor;

        // Create a method here and see if you are able to access livingRoomColor variable.
    }
    public static void main(String[] args) {
        ModelHouse.ModelKitchen modelKitchen = new ModelHouse().new ModelKitchen();
        ModelHouse modelHouse = new ModelHouse();
        System.out.println(modelHouse.livingRoomColor);
    }
}





