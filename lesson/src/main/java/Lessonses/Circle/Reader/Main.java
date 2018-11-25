package Lessonses.Circle.Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader  isr = null;
        int b = 0;

        try {
            /*Для чтения UTF-8*/

            fis = new FileInputStream("D:/Test.txt");
            isr = new InputStreamReader(fis, "UTF-8");
            while((b =  isr.read())!=-1) {
                System.out.println((char)b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
