package typeAnimals;

import Animals.Animal;

import java.util.Objects;

public class Amphibians extends Animal {
    private String livingEnvironment;

    public Amphibians(String name, int year, String livingEnvironment) {
        super(name, year);

        if (livingEnvironment == null) {
            this.livingEnvironment = "Европе";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Amphibians(String nickname, int year) {
        super(nickname, year);
    }


    public void methodAmphibians(String hunt) {
        System.out.println(getName() + "охотиться");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}