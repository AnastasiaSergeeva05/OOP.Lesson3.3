package classAnimals;

import typeAnimals.Birds;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "NoFlying{" +
                "movementType='" + movementType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NoFlying noFlying = (NoFlying) o;
        return Objects.equals(movementType, noFlying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}
