package Lessonses.Circle.SWITCHES;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite vosrast");
        int age=scanner.nextInt();
        switch(age){
            case 0:
                System.out.println("You are born");
                break;
            case 7:
                System.out.println("You go to school");
                break;
            case 17:
                System.out.println("You finished study");
                break;
            default :
                System.out.println("You are wrong");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite strings");
        String string = sc.nextLine();
        switch(string){

            case"first" :
                System.out.println("first");
                break;
            case"secomd" :
                System.out.println("second");
                break;
            case "third" :
                System.out.println("third");
                break;
            default:
                System.out.println("nobody know what happend");

        }


    }
}
