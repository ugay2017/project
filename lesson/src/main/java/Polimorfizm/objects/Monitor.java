package Polimorfizm.objects;


import Inheritance.objects.Comp;
import Inheritance.objects.ElectronicDevice;
import Polimorfizm.objects.toshiba.ToshibaModel2;

public class Monitor extends ElectronicDevice {

public Monitor() {

}

public Monitor(String name) {
    super(name);
}

public Monitor(String name, double weight) {
    super(name, weight);
}

public void connectDevice(Comp comp){
    if(comp instanceof ToshibaModel2) {

        ToshibaModel2 comTosh = (ToshibaModel2) comp;
        ((ToshibaModel2)comp).initializeBeforeConnect();
    }
    comp.connect();
}
}
