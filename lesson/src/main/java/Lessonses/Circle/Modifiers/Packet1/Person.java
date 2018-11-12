package Lessonses.Circle.Modifiers.Packet1;

public class Person {
    /*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
    public final static String CONSTANT = "CONSTANT";


    protected String name;

public Person() {
    name = "Bob";
}

    public Person(String name) {
        this.name = name;
    }
}
