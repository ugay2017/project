package Lessonses.Circle.WRITE_FILE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
PrintWriter pw = new PrintWriter(file);

        System.out.println(System.in);
        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();


    }
}
