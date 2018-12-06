package Collections.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new Vector();
        List list3 = new LinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        for(int i = 0; i<list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println(list1.size());
    }
}
