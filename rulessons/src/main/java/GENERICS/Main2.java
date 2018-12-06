package GENERICS;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Parent {

}

class Child extends Parent {

}

public class Main2 {
    public static void main(String[] args) {
        List<Child> list =new ArrayList<Child>();
        list.add(new Child());
        Main main = new Main();
        main.method((Main) list);

        for(Child file : list) {
            System.out.println(file.getClass());
        }
    }

    void method(List<? extends Parent> list) {
for(Parent parent : list) {
    System.out.println(parent);
}
    }
}
