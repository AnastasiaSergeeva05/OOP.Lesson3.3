package typeAnimals;

import Animals.Animal;

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
    public String toString() {
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public void eatAnimals(String name) {

    }
}
