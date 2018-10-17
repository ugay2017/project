package MyFirstprogram;

import testobject.Computer;

public class MyFirstProgram {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setName("IBM");
        comp.setName(null);
        comp.setName("");
        comp.setHdd(2048);
        comp.setHdd(-2048);
        //  comp.setRam(-1024);
        comp.on();
        comp.off();
        comp.load();

                 comp.setFactoryNumber("     ");
        System.out.println(comp.getFactoryNumber());
    }
}
