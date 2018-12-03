package Exceptions;

import java.io.IOException;

public class Nain {
    public static void main(String[] args) {
        System.out.println(new Nain().someMethod());


    }

    String someMethod() {
        try {
            System.out.println("try");
         //   System.exit(0);

            throw new RuntimeException();

            //Object o =null;

           // o.hashCode();
        } catch(Exception e){
            System.out.println("catch");
return "Catch2";
        } finally {
            System.out.println("finally");
            return "finally2";

        }
    }
}
