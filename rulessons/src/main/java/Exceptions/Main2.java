package Exceptions;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws Exception {
        new Main2().some();
    }

    void some() throws IOException {
        try {
            throw new RuntimeException();
        }catch (RuntimeException e) {

        }

        File file = new File("");
        file.createNewFile();
    }
}
