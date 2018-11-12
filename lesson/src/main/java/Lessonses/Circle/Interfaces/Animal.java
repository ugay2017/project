package Lessonses.Circle.Interfaces;

public class Animal implements Imfo {

    public int id;

    public Animal(int id) {
        this.id = id;
    }
    public void sleep() {
        System.out.println("I am sleeping");
    }

    @Override
    public void log(String str) {
        System.out.println("fvdvd" + str);
    }

    @Override
    public void showInfo() {
        System.out.println("Id is "+this.id);
    }
}
