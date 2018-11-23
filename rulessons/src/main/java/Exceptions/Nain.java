package Exceptions;

public class Nain {
    public static void main(String[] args) {

    }
    String someMethod() {
        try{
            System.out.println("try");
            Object o = null;
            return "try2";

        }catch(NullPointerException e) {
            System.out.println("catch");
            return "catch2";
        }finally {
            System.out.println("finally");
        }

    }
}
