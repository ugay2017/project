package Lessonses.Circle.STRINGBUILDER;

public class Lesson23 {

    public static void main(String[] args) {
        /*увеличение скрости производительности и уменьшение
        * расхода памяти  String*/

        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" my");
        stringBuilder.append(" friend");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" my").append(" friend");

        People p = new People("dfv",11);
        System.out.println(p);
    }
}

class People {
    private String name;
    private int age;

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+ " "+age;
    }
}