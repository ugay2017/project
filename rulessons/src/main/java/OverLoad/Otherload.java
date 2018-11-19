package OverLoad;

public class Otherload {
    int addTwoDigits(int a, int b) {
        return a+b;
    }

    double addTwoDigits(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Otherload o  = new Otherload();
        System.out.println(o.addTwoDigits(1,2));
        System.out.println(o.addTwoDigits(1.0,2.0));

        System.out.println("********");
        OverLoadChild overLoadChild = new OverLoadChild();
        overLoadChild.addTwoDigits(4);
    }
}

class OverLoadChild extends Otherload {
 void addTwoDigits(int i) {
        System.out.println("overload method");
    }
}
