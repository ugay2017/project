package Collections.Queues;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        /*PriorityQueue отсортирует по порядку
        * add==offer
        * poll Достает элементы
        * peek Достает и удаляет элементы
        * */
        Queue q = new PriorityQueue<>();
        Queue w = new LinkedList();

        q.add("13");
        q.add("12");
        q.add("34");
q.offer("14");

while(q.size()>0){
    System.out.println(q.poll());
}

        System.out.println();

List list = (List)q;
Collections.sort(list);

    }
}
