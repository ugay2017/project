package Modifiers.two;

import Modifiers.TestClass;

public class OtherClass extends TestClass {
    void methood() {
        //i=1; недоступен private
        j=0;//protected доступ в иерархии наследования
        //k=4; 
        m = 0;//публичный доступен везде

    }
}
