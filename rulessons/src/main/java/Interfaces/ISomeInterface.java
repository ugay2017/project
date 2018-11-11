package Interfaces;

public interface ISomeInterface extends IOtherInterface{
    int SOME_VARIABLE = 5;
    int i =5;
    void addTwoDigits(int one, int two);
}

interface IOtherInterface {
    void someMethod();
}

interface Bancable {
    void bounce();
}

class Example implements ISomeInterface, Bancable {

    public void addTwoDigits(int one, int two) {

    }

    public void someMethod() {

    }

    public void bounce() {

    }
}
