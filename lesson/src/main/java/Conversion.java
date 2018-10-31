public class Conversion {

    public static void main(String[] args) {
        /*
        byte b;
        int i =257;
        double d = 323.142;

        System.out.println("Preobrazovanie");
        b=(byte)i;
        System.out.println("i and b "+i+" "+b);

        System.out.println("Preobrazovanie double v int");
        i = (int) d;
        System.out.println("d and i "+d+" "+i);

        System.out.println("Preobrazovanie double v byte");
        b = (byte) d;
        System.out.println("d and b "+d+" "+b);
        */

        int month_days[] = new int[3];
        month_days[0]=4;
        month_days[1]=41;
        month_days[2]=42;

        for(int i=0; i<month_days.length; i++){
            System.out.println("para,etr"+i+"i"+month_days[i]);
        }

        int par[]={1,2,3,4,5,6,7,8,9};
        int res =0;

        for(int i=0; i<par.length;i++){
            res = res+par[i];

        }
        System.out.println("Summa = "+res);

        int a=1;
        int b=2;
        int c;
        int d;
        c= ++b;
        d = a++;
        c++;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("d= "+d);


        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = a1|b1;
        boolean d1 = a1 & b1;
        boolean e = a1^b1;
        boolean f = (!a1 & b1) |(a1 & !b1);
        boolean g = !a1;

        System.out.println("  a1   "+a1);
        System.out.println("  b1   "+b1);
        System.out.println("  a1|b1   "+c1);
        System.out.println("  a1 & b1   "+d1);
        System.out.println("  a1^b1   "+e);
        System.out.println("  (!a1 & b1) |(a1 & !b1)   "+f);
        System.out.println("  !a1   "+g);

    }
}
