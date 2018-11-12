package Lessonses.Circle.Interfaces;

public class Person implements Imfo {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void log(String str) {
        System.out.println("string");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is "+ this.name);
    }
}
