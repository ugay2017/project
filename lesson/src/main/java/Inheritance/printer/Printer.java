package Inheritance.printer;

import Inheritance.objects.ElectronicDevice;

public class Printer extends ElectronicDevice {

private boolean colorPrint = false;

public Printer(){

}

public Printer(String name) {
    super(name);
}

public Printer(String name, boolean colorPrint) {
    super(name);
    this.colorPrint = colorPrint;
}

public Printer(String name, double weight, boolean colorPrint) {
    super(name, weight);
    this.colorPrint = colorPrint;
}

    @Override
    public void on() {
        System.out.println("Printer on(): ");
    }

    public void off() {
        System.out.println("Printer off(): ");
    }

    public boolean isColorPrint() {
    return colorPrint;
    }

    public void setColorPrint(boolean colorPrint) {
    this.colorPrint = colorPrint;
    }
}
