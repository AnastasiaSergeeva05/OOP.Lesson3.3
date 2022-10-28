package classAnimals;

import typeAnimals.Mammals;

import java.util.Objects;

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
    public String toString() {
        return "Herbivores{" +
                "typeOfFloot='" + typeOfFloot + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFloot, that.typeOfFloot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFloot);
    }

    @Override
    public void eatAnimals(String name) {

    }
}
