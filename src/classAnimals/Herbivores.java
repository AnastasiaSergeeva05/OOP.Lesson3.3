package classAnimals;

import typeAnimals.Mammals;

public class Herbivores extends Mammals {
    private final String  typeOfFloot;

    public String getTypeOfFloot() {
        return typeOfFloot;
    }



    public Herbivores(String name, int year, String typeOfFloot,
                      int interleavingRate, String livingEnvironment) {
        super(name,year,interleavingRate);

        this.typeOfFloot = typeOfFloot;
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
