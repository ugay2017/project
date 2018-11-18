package Modifiers;

public class TestClass {
/*Доступ внутри класса*/
    private int i = 5;
    /*доступ в иерархии наследования*/
    protected int j =6;
    /*доступ на уровне пакета*/
    int k =7;
    /*доступен всем*/
    public int m=8;


    public void method(){

    }
}

class TestModifiers {
    void method() {
        TestClass t =new TestClass();
        System.out.println(t.m);
    }
}
