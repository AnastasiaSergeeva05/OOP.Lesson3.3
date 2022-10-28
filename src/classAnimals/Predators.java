package classAnimals;

import typeAnimals.Mammals;

public class Predators extends Mammals {
    private String typeOfFloot;

    public Predators(String name, int year, String typeOfFloot, int interleavingRate) {
        super( name, year,interleavingRate);

        this.typeOfFloot = typeOfFloot;
    }

    public String getTypeOfFloot() {
        return typeOfFloot;
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

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFloot='" + typeOfFloot + '\'' +
                '}';
    }

    public void setTypeOfFloot(String typeOfFloot) {
        this.typeOfFloot = typeOfFloot;
    }
}

