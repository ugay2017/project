package Abstract;

public class ExampleClass {
    void method(){
Car car = new Ferrary();
car.Run();
car.Stop();

    }
}

abstract class Car {
    int speed;
    abstract void Run();
    void Stop() {
        speed = 0;
        System.out.println(speed);
    }
}

class Ferrary extends Car {

    @Override
    void Run() {
        speed = 25;
        System.out.println(speed);
    }
}

abstract class Ball extends ExampleClass {

}
