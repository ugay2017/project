package Lessonses.Circle.Polimorfizm;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();

        Animal animal = new Animal();
        Cat cat = new Cat();

        dog.eat();
        animal.eat();

        //Доступны методы Animal
        Animal animal1 = new Dog();
        System.out.println("Dog");
animal1.eat();

/*потому что не наследуется от Dog*/
// animal1.bark();



        Dog dog1 = new Dog();

        dog1.eat();
        dog1.bark();

        /*Доступны методы класса Dog*/
        Dog dog2 = (Dog) new Animal();
dog2.bark();
dog2.eat();


        System.out.println("---------------");

test(animal);
test(dog);
test(cat);

    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
