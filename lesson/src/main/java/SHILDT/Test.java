package SHILDT;

public class Test {
    int a, b;
    void meth(int i, int j) {
        i *=2;
        j /= 2;
    }

    Test(int i, int j){
        a = i;
        b = j;
    }
    void meth2(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        int a=15, b=20;
        System.out.println("Visov a and b "+a+" "+b);

        ob.meth2(ob);
        System.out.println("Visov a and b "+ob.a+" "+ob.b);
    }
}