package Lessonses.Circle.Equals;

public class Jask {
    public static void main(String[] args) {
     Dad dad1 = new Dad(12);
     Dad dad2 = new Dad(123);

        System.out.println(dad1 == dad2);

        String f ="hello";
        String f1 ="hello123".substring(0,5);
        System.out.println(f1);
        System.out.println(f == f1);
    }
}

class Dad {
    private int id;

    public Dad(int i) {
        this.id = i;
    }
}
