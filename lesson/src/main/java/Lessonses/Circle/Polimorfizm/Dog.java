package Lessonses.Circle.Polimorfizm;

public class Dog extends Animal{

    public void bark() {
        System.out.println("dog is lyuing ...");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating ...");
    }

}
