package EQUALS_AND_HASHCODE;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


class Book {
    String autor;
    String name;
}

class Ticket {
    int number;
    String libraryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number &&
                Objects.equals(libraryName, ticket.libraryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, libraryName);
    }
}

public class Main {
    int value;
    public static void main(String[] args) {
      Main main = new Main();
      main.value = 5;
        System.out.println(main + "");

        Map<String, Main> map = new HashMap<>();

        Book book = new Book();
        book.autor = "Karnegy";
        book.name = "how to get friends";
        Map<String, Book> library = new HashMap<>();
        library.put("How to get friends", book);
        library.put(book.name, book);

        Book karnegyBook = library.get(book.name);
        System.out.println(karnegyBook.autor);

        System.out.println(book.hashCode());
        System.out.println(new Book().hashCode());

        Ticket ticket = new Ticket();
        ticket.number = 123;
        Map<Ticket, Book> lib = new HashMap<>();
        lib.put(ticket, book);

        Book karnegy = library.get(ticket);
        System.out.println(karnegy.autor);

        Ticket ticket2 = new Ticket();
        ticket.number = 1123;

        Book karnegy2 = library.get(ticket2);
        System.out.println(karnegy2.autor);
    }

    @Override
    public String toString() {
        return "Main{" +
                "value=" + value +
                '}';
    }
}
