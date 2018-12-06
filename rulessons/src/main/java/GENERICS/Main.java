package GENERICS;

/*Generic methods,class, peremennie*/

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Car extends Main implements  Comparable, Serializable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Main <T extends Main &  Comparable & Serializable> {

    T var;

    public static void main(String[] args) {
       Main main = new Main<>();
      // main.var = new Car();
     //  main.<String>method("123");
     //  main.<Integer>method(124);
       main.method(new Car());

       List<File> list = new ArrayList<>();
       List list2 = new ArrayList();
       list2.add("String");
       list2.add(new Object());
       list2.add("");

       Main main3 = new Main();
       main3.method3(list);

       for(File file : list) {
           System.out.println(file.getAbsoluteFile());
        }

       for(int i=0; i<list.size(); i++){
           System.out.println(list.get(i));
       }
    }

   T method(T type) {
        type.compareTo(new Object());

        System.out.println(type);
        return type;
    }

    <P> P method2(String s){
        System.out.println(s);
        return null;
    }
    void someMethod() {
        System.out.println("bla");
    }

    void method3(List list){
        list.add(new Main());
    }

}
