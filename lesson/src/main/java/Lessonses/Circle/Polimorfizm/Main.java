package Lessonses.Circle.Polimorfizm;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        System.out.println("------");
        /*POLIMORFIZM*/
/*Можем обращать к объекту класса Dog через переменную а*/
        Animal a = new Dog();
        a.eat();//вызывается метод класса Dog
      // a.bark(); недоступен метод класса Dog через перменную а типа А

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();


        System.out.println("-----");

        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
