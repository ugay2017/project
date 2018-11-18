package Constructors;

public class ConstructorExample {
    int i;
    ConstructorExample(String hello, int val) {
        this.i = val;
        System.out.println("run");
        System.out.println(hello);
        System.out.println(val);
    }
}

class Run {
    public static void main(String[] args) {
        ConstructorExample c = new ConstructorExample("vdfv",1234);
    }
}
