package Modifiers.three;

import Modifiers.TestClass;

public class ThirdClass {

    void method() {
        TestClass t = new TestClass();
        System.out.println(t.m);

        /*Доступен только публичный
        * protected и default недоступны*/
    }
}
