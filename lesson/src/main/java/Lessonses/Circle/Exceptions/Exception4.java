package Lessonses.Circle.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, FileNotFoundException {

    }
}
