import classAnimals.Flying;
import classAnimals.Herbivores;
import classAnimals.NoFlying;
import classAnimals.Predators;

public class Main {
    public static void main(String[] args) {


        Flying chaika = new Flying("Чайка", 5, "России", "летать");
        Flying sokol = new Flying("Сокол", 2, "России", "летать");
        Flying albatros = new Flying("Альбюатрос", 2, "России", "летать");


        NoFlying pawlin = new NoFlying("Павлин", 6, "Россия", "не летать");
        NoFlying pingwin = new NoFlying("Пингвин", 2, "Россия", "не летать");
        NoFlying doDo = new NoFlying("Птица Додо", 2, "Россия", "не летать");

        Herbivores lochad = new Herbivores("Лошадь", 7, "зерно", 5, "бегать");
        Herbivores gazel = new Herbivores("Газель", 4, "траву", 5, "бегать");
        Herbivores chiraf = new Herbivores("Жираф", 7, "зерно", 5, "бегать");


        Predators tigr = new Predators("тигр Вова", 8, "есть мясо", 0);
        Predators giena = new Predators("Гиена", 4, "есть мясо", 0);
        Predators medved = new Predators("Медведь", 3, "есть мясо", 0);


        infoFying(chaika);
        infoFying(sokol);
        infoFying(albatros);


        infoHerbivores(lochad);
        infoHerbivores(gazel);
        infoHerbivores(chiraf);

        infoNoFlying(pawlin);
        infoNoFlying(pingwin);
        infoNoFlying(doDo);

        infoPrdators(tigr);
        infoPrdators(giena);
        infoPrdators(medved);



    }


    public static void infoFying(Flying flying) {
        System.out.println("Птица по имени " + flying.getName() +
                " которой " + flying.getYear() + " лет " + "умеет " +
                flying.getMovementType() + ", принадлежащяя к классу " + flying.getClass() + " обитающяя в " + flying.getLivingEnvironment());
    }


    public static void infoHerbivores(Herbivores herbivores) {
        System.out.println("Хищник по имени " + herbivores.getName() +
                " которой " + herbivores.getYear() + " лет " + "ест " +
                herbivores.getTypeOfFloot() + ", принадлежащяя к классу " + herbivores.getClass() + " скорость передвижения " + herbivores.getInterleavingRate());
    }

    public static void infoNoFlying(NoFlying noFlying) {
        System.out.println("Птица по имени " + noFlying.getName() +
                " которой " + noFlying.getYear() + " лет " + "умеет " +
                noFlying.getMovementType() + ", принадлежащяя к классу " + noFlying.getClass() + " обитающяя в " + noFlying.getLivingEnvironment());
    }

    public static void infoPrdators(Predators predators) {
        System.out.println("Хищник по имени " + predators.getName() +
                " которой " + predators.getYear() + " лет " + "ест " +
                predators.getTypeOfFloot() + ", принадлежащяя к классу " + predators.getClass() + " скорость передвижения " + predators.getInterleavingRate());
    }
}