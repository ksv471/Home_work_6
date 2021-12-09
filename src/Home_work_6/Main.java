package Home_work_6;

import Home_work_6.Animals.Animal;
import Home_work_6.Animals.Cat;
import Home_work_6.Animals.Dog;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Персик", 999, 90),
                new Cat("Барсик", 1000, 100),
                new Cat("Мурзик", 2000, 200),
                new Dog("Тузик", 2000, 100),
                new Dog("Шериф", 3000, 300),
                new Dog("Рой", 4000, 400)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].running(150);
            animals[i].swimming(15);
        }
        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
