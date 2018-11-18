package Methods;

public class Example {
    static int  i =8;

    public Example() {
    }

    public Example(int i, float v, boolean b, Object o, String erfv, int... j) {

    }

    static void meth() {
        System.out.println(i);
    }
  static  void method(int i, float f, boolean b, Object o, String s, int... j) {
      System.out.println(i);
      System.out.println(f);
      System.out.println(b);
      System.out.println(o);
      System.out.println(s);
     for(int k : j) {
         System.out.println(k);
     }

    }
}

class Other extends Example {
    public Other(int i, float v, boolean b, Object o, String erfv, int... j) {
        super(i, v, b, o, erfv, j);
    }

    public static void main(String[] args) {
        Example e = new Example();
Example.method(5,4.23f, true, new Object(),"erfv",12324,132,234);

    }
}
