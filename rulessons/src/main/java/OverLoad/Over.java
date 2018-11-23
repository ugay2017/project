package OverLoad;

public class Over {
    public static void main(String[] args) {
Over o = new Over();
short b = 6;
//o.method((byte)b);
o.method(b);
    }
/*
    void method(int i) {
        System.out.println("int");
    }*/
    void method(long i) {
        System.out.println("long");
    }
    void method(Integer i) {
        System.out.println("Integer");
    }
    void method(double i) {
        System.out.println("diuble");
    }
    void method(short... i) {
        System.out.println("byte...");
    }
    void method(Short i) {
        System.out.println("Byte");
    }
    void method(Object i) {
        System.out.println("Object");
    }
    void method(Object... i) {
        System.out.println("Object ...");
    }
    void method(byte i) {
        System.out.println("byte");
    }
}
