package Inner_Classes;

public class Main {

   private int i = 5;
    int k = 8;

    static class SetaticClass {
        void method() {
           // System.out.println(i);

        }
    }

    Inner inner3 = new Inner();

    public static void main(String[] args) {
Main main = new Main();
main.method();

Inner inner = main.new Inner();
        System.out.println(main.k);

    }

    void method() {
        Inner inner=  new Inner();
        inner.method2();
        System.out.println(inner.k);
        inner3.method2();
    }

    class Inner {
        int k = 6;
        void method2() {
            System.out.println(i);
        }
    }
}

class Second {
    void method() {
        /*Для того чтобы создать экземпляр класса Inner нужно
        * сначала создать экземпляр класс Main*/
        Main.Inner inner2 = new Main().new Inner();
        inner2.method2();
    }
}