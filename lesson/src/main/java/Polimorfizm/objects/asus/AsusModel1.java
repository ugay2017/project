package Polimorfizm.objects.asus;

public class AsusModel1 extends Asus {

    public AsusModel1(String name) {
        super(name);
    }

    public void connect() {
        System.out.println("AsusModel1 connect(): ");
    }
}
