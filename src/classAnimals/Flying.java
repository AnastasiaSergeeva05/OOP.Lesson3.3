package classAnimals;

import typeAnimals.Birds;

public class Flying extends Birds {

    private  final String movementType;


    public String getMovementType() {
        return movementType;
    }



    public Flying(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        if (movementType == null) {
            this.movementType = "летает";
        } else {
            this.movementType = movementType;
        }
    }
    public void medhodFlying(String name) {
        System.out.println(name + " умеет летать");

    }


    @Override
    public void methodHunt(String name) {
        System.out.println(name + " умеет охотиться");
    }

    @Override
    public void goAnimals(String name) {


    }

    @Override
    public void sleepAnimals(String name) {

    }

    @Override
    public String toString() {
        return "Flying{" +
                "movementType='" + movementType + '\'' +
                '}';
    }

    @Override
    public void eatAnimals(String name) {

    }

}
