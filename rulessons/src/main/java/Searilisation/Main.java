package Searilisation;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
User user = new User();
user.lifelevel = 55;
User.staticField = 45;

        FileOutputStream file = new FileOutputStream("D:/Text.txt");
        ObjectOutputStream object = new ObjectOutputStream(file);
        object.writeObject(user);
        object.close();

        FileInputStream file2 = new FileInputStream("D:/Text.txt");
        ObjectInputStream object2 = new ObjectInputStream(file2);
        User newUser = new User();
        object2.close();
        System.out.println(newUser.lifelevel);
        System.out.println(User.staticField);
    }
}
