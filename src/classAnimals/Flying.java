package classAnimals;

import typeAnimals.Birds;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public void eatAnimals(String name) {

    }

}
