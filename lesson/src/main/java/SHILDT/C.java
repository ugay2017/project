package SHILDT;

public class C {
    int i;
}

class D extends C {
    int i;

    D(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i  в суперклассе : "+super.i);
        System.out.println("Член i в подклассе: "+i);
    }

}

class UseSuoer {
    public static void main(String[] args) {
        D subOb = new D(1,2);

        subOb.show();
    }
}
