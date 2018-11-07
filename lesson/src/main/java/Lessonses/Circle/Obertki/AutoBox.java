package Lessonses.Circle.Obertki;

import java.util.ArrayList;
import java.util.List;

public class AutoBox {

    public static void main(String[] args) {
        Integer i = new Integer("5");

        /*Конвнертация в число*/
        int k = Integer.parseInt("2");
      int q=  i.valueOf("3");


        System.out.println(k);
        System.out.println(q);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int l:list){
            System.out.println(l);
        }

        /*== проверяет память equals Проверяет значения*/


        String s="string";
        String s2="string";
        Object o1 = new Object();
        Object o2 = new Object();
        if(s == s2){
            System.out.println("==");
        }

        if(o1.equals(s2)){
            System.out.println("equals");
        }else{
            System.out.println("no");
        }
    }
}
