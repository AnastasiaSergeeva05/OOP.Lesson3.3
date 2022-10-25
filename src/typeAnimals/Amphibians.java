package typeAnimals;

import Animals.Animal;

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
}