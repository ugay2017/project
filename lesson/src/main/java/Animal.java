public class Animal {

public Animal(){}


    public Animal(String name) {
    }

    public void eat() {
        System.out.println("animal eat");
    }
}

    class Dog extends Animal {

private String name;
private double weight;

        public Dog() {
            System.out.println("Call empty constructor");
        }

        public Dog(String name) {
            System.out.println("Call constructor with Name");
            this.name = name;

        }

        public Dog(String name, Double weight) {
            this(name);
            this.weight = weight;
            System.out.println("Call constructor with Name and Weight");
        }


        public void eat() {
            System.out.println("Dog eat");
        }
        public void thisEat() {
            System.out.println("Call Dog.eat()");
            this.eat();
        }

        public void superEat() {
            System.out.println("Call Animal.eat()");
            super.eat();
        }

    }

    class Test {

        public static void main(String[] args) {
            Dog dog = new Dog("Name",23.5);
            dog.eat();
            dog.thisEat();
            dog.superEat();
        }



    }

