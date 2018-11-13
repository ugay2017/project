package Lessonses.Circle.Generic;

import java.util.ArrayList;
import java.util.List;

public class Dosd {
    public static void main(String[] args) {
        List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add("rve");

        System.out.println(list.get(1));

        List<String> anim = new ArrayList<String>();
        anim.add("dfvdf");
        anim.add("dfdfbvvdf");
        anim.add("dfvdfvdf");
        anim.add("dfvdfvdf");



        /*GENERICS*/

        List<Dvds> list3 = new ArrayList<>();
list3.add(new Dvds(123));
list3.add(new Dvds(24));

test(list3);
    }

    private static void test(List<Dvds> list3){
        for(Dvds dvds : list3){
            System.out.println(dvds);
        }
    }
}
