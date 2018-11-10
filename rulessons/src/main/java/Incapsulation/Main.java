package Incapsulation;

public class Main {
    public static void main(String[] args) {
        Person p =new Person();
        System.out.println(p.getName());
        p.setName(" Sam");
        System.out.println(p.getName());
    }
}
