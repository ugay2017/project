package Polimorfizm.objects.toshiba;

public class ToshibaModel1 extends Toshiba {
    public ToshibaModel1(String name) {
        super(name);
    }

    public void connect() {
        System.out.println("ToshibaModel1 connect(): ");
    }
}
