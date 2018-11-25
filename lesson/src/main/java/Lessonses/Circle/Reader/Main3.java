package Lessonses.Circle.Reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        FileWriter fr = null;
        String str = "Haba";
        File file = new File("D:/Hot.txt");

            try {
                fr = new FileWriter("D:/1.txt", true);

                fr.write(str);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

