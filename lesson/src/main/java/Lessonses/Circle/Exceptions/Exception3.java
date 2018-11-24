package Lessonses.Circle.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) throws FileNotFoundException {
        //checked exception исключительные случаи которые должны быть обработаны
        //unchecked ошибка в работе программы
        File file = new File("fdv");
        Scanner scanner = new Scanner(file);
/*unchecked*/
        int a = 1/0;
        String name = null;
        name.length();
        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
