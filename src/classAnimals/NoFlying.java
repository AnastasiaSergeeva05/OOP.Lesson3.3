package classAnimals;

import typeAnimals.Birds;

public class NoFlying extends Birds {

    private String movementType;

    public String getMovementType() {
        return movementType;
    }

    public NoFlying(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        if (movementType == null) {
            this.movementType = "не летает";
        } else {


            this.movementType = movementType;
        }

    }

    public void medhodNoFlying(String name) {
        System.out.println(name + "не умеет летать");

    }

    @Override
    public void goAnimals(String name) {

    }

    @Override
    public void sleepAnimals(String name) {

    }

    @Override
    public void eatAnimals(String name) {
    }
}
