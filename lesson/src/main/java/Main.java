public class Main extends Object {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = o1;

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        Main main = new Main();

        System.out.println(main instanceof Object);
        System.out.println(5+6+"");

        int a=5;
        System.out.println(a++);//5
        System.out.println(a);//6

        int b=3;
        System.out.println(++a);//4
        System.out.println(a);//4

        /*Тернарный оператор*/
        int z = (5>6)?1:2;
        System.out.println(z);


    }
}
