public class StaticExmpl {
    static int i = 5;
    int j = 6;
    static {i = 6;
        System.out.println("static initializer");
    }
    {
        System.out.println("initializer");
    }
    StaticExmpl() {
        i++;
        System.out.println("Constructor");
    }

    static void staticMethod() {
        System.out.println("static method");
        i = 7;
        System.out.println(i);//статичным метод может обращаться только к статическим переменным

    }

    public static void main(String[] args) {
        StaticExmpl staticExmpl = new StaticExmpl();
        StaticExmpl staticExmpl2 = new StaticExmpl();
        staticExmpl.j = 1;
        staticExmpl2.j = 2;
        System.out.println(staticExmpl.j);
        System.out.println(staticExmpl2.j);
        staticExmpl.i = 1;
        staticExmpl2.i = 2;
        System.out.println(staticExmpl.i);
        System.out.println(staticExmpl2.i);

        System.out.println("*****");
        System.out.println(StaticExmpl.i);
        StaticExmpl.staticMethod();
        System.out.println(StaticExmpl.i);

        System.out.println("******");
        new StaticExmpl();
        new StaticExmpl();
        new StaticExmpl();
        new StaticExmpl();
        System.out.println(StaticExmpl.i);
    }

}
