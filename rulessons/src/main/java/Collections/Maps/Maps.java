package Collections.Maps;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map map = new HashMap();
        /*Синхронизированный неупорядоченный*/
        Map map1 = new Hashtable();

        /*TreeMap сортирует*/
        Map map2 = new TreeMap();
        /*Сохранение порядка в котором добавлялись элементы*/
        Map map3 = new LinkedHashMap();

        map2.put("1","one");
        map2.put("3","three");
        map2.put("2","two");

        System.out.println(map3.get("3"));

        Set set = map2.entrySet();
        for(Object o: set) {
            System.out.println(o);
        }
    }
}
