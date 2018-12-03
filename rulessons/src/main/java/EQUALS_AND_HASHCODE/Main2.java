package EQUALS_AND_HASHCODE;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


class Books {
    String autor;
    String name;
}

class Ticket3 {
    int number;
String libraryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket3 ticket3 = (Ticket3) o;
        return number == ticket3.number &&
                Objects.equals(libraryName, ticket3.libraryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, libraryName);
    }
}

public class Main2 {
    int value;
    public static void main(String[] args) {
      Main2 main2 = new Main2();
      main2.value = 5;

Books book= new Books();
book.autor = "Karnegy";
book.name = "How to get friends";
        Map<String, Books> map = new HashMap<>();
map.put("How to get friends ",book);
map.put(book.name,book);


Books karnegyBook = map.get(book.name);
        System.out.println(karnegyBook.autor);

        System.out.println(book.hashCode());
        System.out.println(new Book().hashCode());


        Ticket3 t = new Ticket3();
        Map<Ticket3, Books> map3 = new HashMap<>();
        map3.put(t,book);

        Books kar =map3.get(t);
        System.out.println(kar.autor);

        Ticket t3 = new Ticket();
        t3.number = 1123;

        Books g = map3.get(t3);
        System.out.println(g.autor);
    }
/*
    public String toString() {
        return "value s"+ value;
    }*/
}
