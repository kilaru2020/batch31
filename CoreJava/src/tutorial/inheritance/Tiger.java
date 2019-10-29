package tutorial.inheritance;

public abstract class Tiger extends Animal { // IS-A relationship
    private String stripWidth; // Tiger
    private String jumpingLevel; // Tiger

    public Tiger(int noOfLegs, String name , String place) {
        // this(*,*,*);
        super(noOfLegs,name,place);
    }

    @Override
    public void foodHabits() {
        System.out.println("I eat meat...");
    }

    public String getStripWidth() {
        return stripWidth;
    }

    public void setStripWidth(String stripWidth) {
        this.stripWidth = stripWidth;
    }

    public String getJumpingLevel() {
        return jumpingLevel;
    }

    public void setJumpingLevel(String jumpingLevel) {
        this.jumpingLevel = jumpingLevel;
    }
}
