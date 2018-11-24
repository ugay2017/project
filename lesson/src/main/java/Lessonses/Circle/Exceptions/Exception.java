package Lessonses.Circle.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args)  {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*
        File file = new File("sd");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("after block");
        */
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("sd");

            Scanner scanner = new Scanner(file);
    }
}
