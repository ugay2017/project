package SHILDT;

public class Test2 {
    int a;

    Test2(int i) {
        a = i;
    }

    Test2 incrByTen() {
        Test2 tmp = new Test2(a+10);
        return tmp;
    }
}

class RetOb {
    public static void main(String[] args) {
        Test2 ob1 = new Test2(2);
        Test2 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a "+ob1.a);
        System.out.println("ob2.a "+ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a "+ob2.a);
    }
}
