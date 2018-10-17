package OOP.objects;

public class Bus {
    public int number;
    public String model;

    public void drive(){
        System.out.println("Bus number: "+number+" drive");
    }

    public void stop() {
        System.out.println("Bus stop");
    }

    public void beep() {
        System.out.println("Bus beep");
    }

    public void showInfo() {
        System.out.println("Bus model="+model);
        System.out.println("Bus number="+number);
    }

    public void stop(String stationName) {
        System.out.println("Bus stop at station "+stationName);
    }

    public void moveFrom(String stationName) {
        System.out.println("Bus moved from station "+stationName);
    }

    public void moveTo(String stationName) {
        System.out.println("Bus moved to station "+stationName);
    }
}
