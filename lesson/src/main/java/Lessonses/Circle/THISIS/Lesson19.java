package Lessonses.Circle.THISIS;

public class Lesson19 {
    public static void main(String[] args) {
        Human h = new Human();
        h.setName("fvdf");
        h.setAge(13);
        h.getInfo();
    }

}

class Human {
    String name;
    int age;

    public void setName(String myname) {
        name = myname;
    }

    public void setAge(int myage) {
        age = myage;
    }

    public void getInfo() {
        System.out.println(name+ ","+age);
    }


}
