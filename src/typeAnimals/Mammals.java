package typeAnimals;

import Animals.Animal;

import java.util.Objects;

public class Mammals extends Animal {
    private String livingEnvironment;
    private int interleavingRate;

    public int hashCode() {
        return Objects.hash(livingEnvironment, interleavingRate);
    }

    public Mammals(String name, int year,int interleavingRate) {
        super(name, year);

        if (livingEnvironment == null) {
            this.livingEnvironment = "Европе";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

        if (this.interleavingRate == 0) {
            this.interleavingRate = 300;
        } else {
            this.interleavingRate = interleavingRate;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }


    public int getInterleavingRate() {
        return interleavingRate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return interleavingRate == mammals.interleavingRate && livingEnvironment.equals(mammals.livingEnvironment);
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
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", interleavingRate=" + interleavingRate +
                '}';
    }
}
