package Peremennaya;

public class TempClass {

    public static void main(String[] args) {
        System.out.println(Car.maxspeed);
        Car car1 = new Car(123);
        Car car2 = new Car(123);
        System.out.println(car1.maxspeed);
        car1.maxspeed = 250;
        System.out.println(car1.maxspeed);
        System.out.println(car1.var);
        car1.method(9);
    }
    int i = 5;
    Object object;


}
