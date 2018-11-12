package Lessonses.Circle.Interfaces;

public class Tets {

    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Name");

        animal1.sleep();
        person1.sayHello();

        animal1.showInfo();
        person1.showInfo();

        System.out.println("****POLIMORFISM******");

        Imfo info1 = new Animal(1);
        Imfo info2 = new Person("Ban");
    info1.showInfo();
    info2.showInfo();


        System.out.println("---------");

        outputInfo(animal1);
        outputInfo(person1);

    }

    public static void outputInfo(Imfo info) {
        info.showInfo();
    }
}
