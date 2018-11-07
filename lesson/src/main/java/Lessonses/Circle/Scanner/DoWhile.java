package Lessonses.Circle.Scanner;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Vvedi 5");
        int value = s.nextInt();
        while(value!=5){
            System.out.println("vvedite 5");
            value=s.nextInt();
        }
        System.out.println("Vi vveli 5");


        int v;
        do{
            System.out.println("Vvedite 5");
            v=s.nextInt();
        }while(v!=5);
        System.out.println("OK");
    }

}
