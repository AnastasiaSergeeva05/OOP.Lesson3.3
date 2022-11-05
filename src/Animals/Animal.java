package Animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int year;

    public Animal(String name, int year) {
        if (name == null) {
            this.name = "введите животное";
        } else {
            this.name = name;
        }
        if (year == 0) {
            this.year = 1;
        } else {
            this.year = year;
        }
    }

    public String getName() {
        return name;
    }



    public int getYear() {
        return year;
    }



    public abstract void goAnimals(String name);

    public abstract void sleepAnimals(String name);


    public abstract void eatAnimals(String name);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return year == animal.year && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}








