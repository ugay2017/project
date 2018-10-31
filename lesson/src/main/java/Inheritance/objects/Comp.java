package Inheritance.objects;

public class Comp extends ElectronicDevice {

    private int ram;
    private int hdd;

    private boolean cdWritable = true;

    public Comp(){ }

    public Comp(String name) {
        super(name);
    }

    public Comp(String name, double weight) {
        super(name, weight);
    }

    public Comp(String name, boolean cdWritable) {
        super(name);
        this.cdWritable = cdWritable;
    }

    public Comp(String name, double weight, int ram, int hdd, boolean cdWritable) {
        super(name, weight);

        this.ram = ram;
        this.hdd = hdd;
        this.cdWritable = cdWritable;

        on();
    }

    public void writeDisc() {
        System.out.println("Объект "+ this.getName());
        if(cdWritable) {
            System.out.println("Disc recover");
        }else {
            System.out.println("Can't recover Disc");
        }
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public boolean isCdWritable() {
        return cdWritable;
    }

    public void setCdWritable(boolean cdWritable) {
        this.cdWritable = cdWritable;
    }

    public void on() {
        System.out.println("Computer is on():");
    }

    public void connect() {
        System.out.println("Computer connect(): ");
    }
}
