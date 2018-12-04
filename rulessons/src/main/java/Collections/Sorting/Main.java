package Collections.Sorting;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class Person implements Comparable<Person> {
    int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age-p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class ComparePerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }


    public Comparator<Person> reversed() {
        return null;
    }


    public Comparator<Person> thenComparing(Comparator<? super Person> other) {
        return null;
    }



}

public class Main {
    public static void main(String[] args) {
        Set set = new TreeSet(new ComparePerson());
        set.add(new Person(3));
        set.add(new Person(4));
        set.add(new Person(1));
        set.add(new Person(2));

       // set.add("2");
       // set.add("4");
       // set.add("1");

        for(Object o : set) {
            System.out.println(o);
        }
    }
}
