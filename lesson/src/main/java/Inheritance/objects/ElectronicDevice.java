package Inheritance.objects;

public class ElectronicDevice {

    private String name;
    private double weight;

    public ElectronicDevice() { }

    public ElectronicDevice(String name) {
        this.name = name;
    }

    protected ElectronicDevice(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void on() {
        System.out.println("ElectronicDevice on(): ");
    }

    public void off() {
        System.out.println("ElectronicDevice off():");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void connect() {
        System.out.println("Connect");
    }
}
