package Constructors;


class MyParent {
    MyParent(int i) {
        System.out.println("MyParentConstructor");
    }
    MyParent() {
        System.out.println("Default constructor");
    }
}

public class Example extends MyParent {
    Example() {
        System.out.println("Constructor Example");
    }

    public static void main(String[] args) {
        new Example();
    }
}
