package SHILDT;

public abstract class Abs {

    abstract void callme();

    void callmetoo() {
        System.out.println("Это не конкретный метод.");
    }
}

class Bass extends Abs {

    @java.lang.Override
    void callme() {
        System.out.println("fvdvfd");
    }
}

class AbstarctDemo {
    public static void main(String[] args) {
        Bass b = new Bass();

        b.callme();
        b.callmetoo();
    }
}
