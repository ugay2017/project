package Clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject myObject = new MyObject();
        NewObject newObject = new NewObject();
        newObject.j = 3;
        myObject.i = 1;
        MyObject myObject1 = myObject.clone();
        myObject1.i = 4;
        System.out.println(myObject.i);

        myObject.newObject.j = 5;
        System.out.println(myObject.newObject.j);
    }
}

class MyObject implements Cloneable {
NewObject newObject;
    int i;


    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}

class NewObject implements Cloneable {


    int j;
}
