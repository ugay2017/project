package testobject;

public class Computer {

    private String name;

    private int ram;

    private int hdd;

    private double weight;

    private String factoryNumber;
    private int cpuNumber;
    private int height;

    public boolean isCdReadable() {
        return cdReadable;
    }

    public void setCdReadable(boolean cdReadable) {
        this.cdReadable = cdReadable;
    }

    private int width;

private boolean cdReadable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name != null && !name.equals("")) {
           this.name = name;
       }else {
           System.out.println("Переданное значение name "+name+" не может быть пустым" );
       }
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram>0){
            this.ram = ram;
        }else {
            System.out.println("Переданное значение "+ram+" не может быть отрицательным");
        }

    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
       if(hdd > 0){
           this.hdd = hdd;
       }else {
           System.out.println("Переданное значение "+hdd+" не может быть пустым");
       }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0) {
            this.weight = weight;
        }else {
            System.out.println("переданное значение weight"+weight+" не может быть отрицательным");
        }

    }

    public String getFactoryNumber() {
        if(factoryNumber == null || factoryNumber.trim().equals("")){
            return "(ошибка) не указанный заводской номер";
        }
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
       if(factoryNumber != null && !factoryNumber.trim().equals("")) {
           this.factoryNumber = factoryNumber;
       }else {
           System.out.println("Переданное значение factoryNumber "+factoryNumber+" не может быть пустым");
       }
    }

    public int getCpuNumber() {
        return cpuNumber;
    }

    public void setCpuNumber(int cpuNumber) {
        this.cpuNumber = cpuNumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void on() {

        print("I am on "+ name);
    }

    public void off() {

       print("I am off "+ram);
    }

    public void load() {

       print("I am load "+hdd+" GB");
    }

    public void reboot() {
        print("I am load");
    }

    public void readCD() {
        if(cdReadable) {
            print("Считываю диск");
        }else {
            print("Не могу считать диск, устройство не поддерживается.");
        }
    }

    private void print(String str) {
        System.out.println(str);
    }
}
