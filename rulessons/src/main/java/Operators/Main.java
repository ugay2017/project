package Operators;

public class Main {

    public static void main(String[] args) {
        Object  o =new Object();
        Object  o2 =new Object();


/*сравнение знаяение */
        System.out.println(o == o2);


        System.out.println(o.equals(o2));

        Object o3 = new Object();
        Object o4 = o3;
        /*Один адресс памяти*/
        System.out.println(o3 == o4);

        Main main = new Main();
        System.out.println(main instanceof Main );

        System.out.println(5+6+""+22+3);//5+6 11 223

        /*INCREMENT*/
        int a = 5;
        System.out.println(a++ + ++a);
        System.out.println(a);
        int b = 7;
        System.out.println(b++);
        System.out.println(b);

        int c = (5>4)? 1 : 0;
        System.out.println(c);


        System.out.println(3>4 && 4>3);
        System.out.println(3>2 && 4>3);
        System.out.println(3>2 || 4>3);
        System.out.println(3>4 || 4>3);

        System.out.println(4>3 & 3>2);

        System.out.println(true ^ false);
        System.out.println(false ^ false);
    }
}
