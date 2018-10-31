package Inheritance.main;

import Inheritance.asus.AsusModel1;
import Inheritance.asus.AsusModel2;
import Inheritance.toshiba.ToshibaModel1;
import Inheritance.toshiba.ToshibaModel2;

public class MyFirstProg {

    public static void main(String[] args) {

        ToshibaModel1 toshibaModel1 = new ToshibaModel1("T1");
        ToshibaModel2 toshibaModel2 = new ToshibaModel2("T2");

        AsusModel1 asusModel1 = new AsusModel1("A1");
        AsusModel2 asusModelw = new AsusModel2("A2");

        toshibaModel1.writeDisc();
        asusModel1.writeDisc();

    }
}
