package tutorial.inheritance;

//public class Animal extends Object {
public class Animal {
    private int noOfLegs;
    private String name;
    private String place;
//    public Animal(){}
    public Animal(int noOfLegs, String name , String place) {
        this.noOfLegs = noOfLegs;
        this.name = name;
        this.place = place;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * less noise , no noise , huge noise
     */
    public void noiseLevel() {
        System.out.println("Level is medium");
    }

    public void swimmingCapability() {

    }
}
