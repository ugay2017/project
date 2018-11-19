public class UseStatic {
    static int a = 3;
    static int b = 99;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }

    static {
        System.out.println("Статический блок инициализирован");
        b = a *4;
    }

    static void callme() {
        System.out.println("a = "+a);
    }

    public static void main(String[] args) {
        meth(42);
        UseStatic.callme();
        System.out.println("b = "+UseStatic.b);
    }
}
