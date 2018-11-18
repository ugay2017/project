package Lessonses.Circle.Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hit> list = new ArrayList<>();
        list.add(new Hit(1));
        list.add(new Hit(2));



        List<Hot> list2 = new ArrayList<>();
        list2.add(new Hot(3));
        list2.add(new Hot(4));

        test(list);
        test(list2);
    }

    public static void test(List<? extends Hit> list) {
        for(Hit hit : list){
           // System.out.println(hit);

        }
    }


}
