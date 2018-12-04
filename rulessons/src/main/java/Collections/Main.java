package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        Collections collections;
        Arrays arrays;

        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");

        collection.remove("2");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o : collection) {
            System.out.println(o);
        }


        System.out.println("-------------");

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        list.set(2,"4");

        System.out.println(list.get(0));

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
     //   Set set = new HashSet();
        System.out.println("****");
        Queue q = new PriorityQueue();
        q.offer("1");
        q.offer("2");
        q.offer("3");
        q.offer("4");

        for(int i = 0; i<q.size(); i++) {
            System.out.println(q.peek());

        }
        System.out.println(q.size());

        Iterator iter =q.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());

        }


        System.out.println("---------------");
        System.out.println("---------------");

        /*Все элементы уникальные*/
        Set set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");

        for(Object o : set) {
            System.out.println(o);
        }


        System.out.println("------MAP------");
        System.out.println("---------------");


    }
}
