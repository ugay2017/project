package Exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Main().method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void method() throws IOException {
        try {
            //throw new RuntimeException();
            throw new IOException();
        }catch(Exception e) {

        }
    }
}

/*RuntimeException можно не обрабатывать, относятся к unchecked exception*/
/*IOException Относиться к checked проверяемым нужно обрабатывать компилятором*/