package SHILDT;

public class E {
    int i,j;
    E(int a, int b) {
        i=a;
        j=b;
    }

    void show() {
        System.out.println("i and j : "
        +i+" "+j);
    }
}

class F extends E {
int k;
    F(int a, int b, int c) {
        super(a, b);
        k=c;
    }

    void show() {
        System.out.println("k: "+k);
    }
}

class Override {
    public static void main(String[] args) {
        F f = new F(1,2,3);
        f.show();
    }
}