package classAnimals;

import typeAnimals.Mammals;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typeOfFloot.equals(predators.typeOfFloot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFloot);
    }
}

