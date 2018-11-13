package Lessonses.Circle.Preobrazovanie;

import Lessonses.Circle.Polimorfizm.Animal;
import Lessonses.Circle.Polimorfizm.Dog;

public class Rest {

    public static void main(String[] args) {
        Dog box = new Dog();
        //Upcasting - Восходящее преобразование
        Animal naps = box;

        //Downcasting - нисходящее преобразование
        Dog fox = (Dog) naps;
    }
}
