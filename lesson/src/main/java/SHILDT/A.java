package SHILDT;

public class A {
    int i, j;

    void showij() {
        System.out.println("i and j"+i+" "+j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k :"+k);
    }

    void sum() {
        System.out.println("i+j+k "+(i+j+k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb  = new B();

        //СУПЕР  может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Sodergimoe object superOb");
        superOb.showij();
        System.out.println();

//Подкласс имеет доступ ко всем членам своего суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("Sodergimoe object subOb");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Summa i,j and k in object subOb: ");
        subOb.sum();
    }
}
