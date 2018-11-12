package Lessonses.Circle.STATICS;

public class Lesson20 {
    public static void main(String[] args) {
      //  Human h1 = new Human("Bob", 30);
        //h1.setName("Tom");
/*Без сощдание объекта класса Human*/
        /*
        Human.description="Nice";
        Human.getDescription();

        Human h1 = new Human("Bob", 30);
        Human h2 = new Human("Bobsdc", 32340);
    Human.description="Bob";
    h1.getAllFields();
    h2.getAllFields();
    */
        Math.pow(2,4);

        /*STATIC*/
        Human h1 = new Human("Bob", 30);
        Human h2 = new Human("Bobsdc", 32340);
        h1.printNumberOfPeople();

        h2.printNumberOfPeople();
        Human h3 = new Human("Bobsdc", 32340);
h1.printNumberOfPeople();

h2.printNumberOfPeople();
h3.printNumberOfPeople();
    }
}

class Human {

    private String name;
    private int age;
    private static int countPeople ;//автоматически равна 0

    public static String description;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
   countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
       // return description;
        System.out.println(description);
    }


    public void getAllFields(){
        System.out.println(name + " , "+age+" "+description);
    }

    public static void printAllFields() {
        System.out.println();
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people "+countPeople);
    }
}
