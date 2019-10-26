package tutorial.inheritance;

public class MountainTiger extends Tiger {

    float minusSurvivingTemp = -20;

    public MountainTiger(int noOfLegs, String name, String place, float minusSurvivingTemp) {
        super(noOfLegs, name, place);
    }

    public MountainTiger (String place, float minusSurvivingTemp) {
        super(4,"Mountain Tiger",place);
        this.minusSurvivingTemp = minusSurvivingTemp;
    }

    @Override // annotation
    public void noiseLevel(){
        System.out.println("Noise Level For Mountain Tiger is very Tigerish.....");
    }

    public void mountainTigerVisibilityRatio(){
        System.out.println("Visibility is very low ");
    }
}
