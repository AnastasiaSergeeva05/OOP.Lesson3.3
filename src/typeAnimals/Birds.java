package typeAnimals;

import Animals.Animal;

import java.util.Objects;

public class Birds extends Animal {
    private String livingEnvironment;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }



    public Birds(String name, int year, String livingEnvironment) {
        super(name, year);

        if (livingEnvironment == null) {
            this.livingEnvironment = "Европе";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }


    public Birds(String nickname, int year) {
        super(nickname, year);
    }

    public void methodHunt(String name){
        System.out.println(name+" умеет охотиться");
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
        Birds birds = (Birds) o;
        return livingEnvironment.equals(birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
    @Override
    public String toString() {
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
