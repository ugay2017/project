package Lessonses.Circle.Constructors;

public class Lesson20 {

    public static void main(String[] args) {
Human h = new Human("vfd", 13);
h.setInfo();

    }
}

class Human {
    private String name;
    private int age;

    public Human(){

    }

    public Human(String name, int age) {
        this.name=name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void setInfo(){
        System.out.println(name+ " ,"+age);
    }




}
