package Lessonses.Circle.Exceptions_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExample {

    private ABC abc = new ABC();

    /*
private ABC abc;

    public void foo() {
      //  System.out.println(1/0);
     //   int array[] ={1,2,3};
       // array[5] = 4;
try{
    abc.show();
    System.out.println(1/0);

}catch(ArithmeticException | NullPointerException  e) {
    e.printStackTrace();
}



    }

    */

    FileInputStream fileInputStream = null;

    public void ErrorExample()  {
        try {
            fileInputStream  = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
