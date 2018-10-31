package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListView {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("aaaa");

        for(String s : list) {
            System.out.println(s);
        }

        System.out.println(list.get(0));

        System.out.println(list.size());
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.get(0));


        list.clear();
        System.out.println(list.size());
    }
}
