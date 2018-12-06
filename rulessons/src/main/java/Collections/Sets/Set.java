package Collections.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*Хранит неповторяющиеся элементы*/
public class Set {

    public static void main(String[] args) {
        /*Неупорядоченная*/
        HashSet set1 = new HashSet();
        /*Упорядоченная*/
        HashSet set2 = new LinkedHashSet();
        /*Отсортированная*/
        TreeSet<Object> set3 = new TreeSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("1");
        set1.add("3");
        for(Object o: set1){
            System.out.println(o);
        }
    }
}
