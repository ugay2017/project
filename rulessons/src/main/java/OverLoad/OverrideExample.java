package OverLoad;

/*нельзя сужать public а потом protected*/
class Parent {
    int method() {
        return 1;
    }
}

class Child extends Parent {
    @Override
    int method() {
        return 2;
    }
}



public class OverrideExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.method());
        System.out.println(child.method());
    }
}
