package Polimorfizm.objects.main;

import Inheritance.asus.AsusModel1;
import Inheritance.objects.Comp;
import Inheritance.objects.NoteBook;
import Inheritance.toshiba.ToshibaModel1;
import Polimorfizm.objects.Monitor;
import Polimorfizm.objects.asus.AsusModel2;
import Polimorfizm.objects.toshiba.ToshibaModel2;

public class StartProgram {

    public static void main(String[] args) {
        Comp toshiba1 = new ToshibaModel1("T1");
        Comp toshiba2 = new ToshibaModel2("T2");

        Comp asus1 = new AsusModel1("A1");
        Comp asus2 = new AsusModel2("A2");

        Comp note1 = new NoteBook("Note 1");
        Comp comp1 = new Comp("Comp 1");

        Monitor monitor = new Monitor();

        monitor.connectDevice(toshiba1);
        monitor.connectDevice(toshiba2);
        monitor.connectDevice(asus1);
        monitor.connectDevice(asus1);
        monitor.connectDevice(note1);
        monitor.connectDevice(comp1);
    }
}
