package Obertki;

public class AutoBox {
    public static void main(String[] args) {
        int i = new Integer("5");
        System.out.println(i);

        String s1 = "string";
        String s2 = "string";
        Object o1 = new Object();
        Object o2 = o1;

        /*equals проверяет значение
        * == проверяет память*/
        if(s1 == s2) {
            System.out.println("==");
        }
    if(o1.equals(o2)){
            System.out.println("equals");
        }
    }
}
