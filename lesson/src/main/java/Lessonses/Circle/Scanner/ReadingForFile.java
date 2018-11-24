package Lessonses.Circle.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static java.io.File.separator;

public class ReadingForFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separatror = separator;
        String path = separator + "Users"+separator+"C"+separator+"gulp"+separator+"red";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
       /*
       while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        */
       String line = scanner.nextLine();
       String[] words = line.split(" 0 ");
        System.out.println(Arrays.toString(words));

        int[] numbers = new int[3];
        int counter = 0;
        for(String number : words) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
      scanner.close();
    }
}
