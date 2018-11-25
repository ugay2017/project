package Lessonses.Circle.Reader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        /*Используется для записи*/
        FileOutputStream file = null;
        String str = "Hot";

        try {
          file = new FileOutputStream("D:/Text.txt");
            file.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
