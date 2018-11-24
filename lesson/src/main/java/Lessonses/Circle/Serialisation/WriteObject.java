package Lessonses.Circle.Serialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Name1");
        Person person2 = new Person(2,"Name2");

        try {
            FileOutputStream fos = new FileOutputStream("text");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
