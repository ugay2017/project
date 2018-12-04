package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Book {
    String nameAutor;

    public Book(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAutor='" + nameAutor + '\'' +
                '}';
    }
}

 class Main2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","Dan Brown");
        map.put("2",new Book("Karnegy"));
        map.put("3","Jack London");

        System.out.println(map.get("2"));

        Set set = map.keySet();//entrySet
        for(Object o : set){
            System.out.println(o);
        }
    }
}
