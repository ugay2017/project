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

        Integer i = new Integer(432);
        String s = i.toString();
        System.out.println(s);

        Integer j = new Integer("2345");
        Integer g = j.valueOf("223");
        System.out.println(g);

        Number n1 = new Double(2.34);
        Integer r = n1.intValue();
        System.out.println(r);
    }

    public static void test(List<? extends Hit> list) {
        for(Hit hit : list){
           // System.out.println(hit);

        }
    }


}
