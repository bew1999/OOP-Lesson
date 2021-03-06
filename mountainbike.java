public class MountainBike extends Bicycle {
    private String suspension; //addition of suspension --> data encapsulation

    public MountainBike( //addition of new variables startCadence, startSpeed, startGear
               int startCadence,
               int startSpeed,
               int startGear,
               String suspensionType){
        super(startCadence, //
              startSpeed,
              startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
      return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a" +
            getSuspension() + " suspension.");
    }
} 
