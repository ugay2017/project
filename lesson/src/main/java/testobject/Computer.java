package testobject;

public class Computer {

    private String name;

    private int ram;

    private int hdd;

    private double weight;
    private boolean cdReadable;

    private String factoryNumber;
    private int cpuNumber;
    private int height;

    /*Dop zadanie*/

    private Computer[] userComps;//массив всех созданных компьютеров
    private boolean adminComp;//указатель, является ли текущий компьютер админским
    private String status = "nothing";//текущее состояние компьютера

    /*``````````````*/

    public Computer[] getUserComps() {
        return userComps;
    }

    public void setUserComps(Computer[] userComps) {
        this.userComps = userComps;
    }

    public boolean isAdminComp() {
        return adminComp;
    }

    public void setAdminComp(boolean adminComp) {
        this.adminComp = adminComp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Конструкторы
     *
     * */
    public Computer() {
        on();

    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, boolean adminComp) {
        this.name = name;
        this.adminComp = adminComp;
    }

    public Computer(int ram) {
        this.ram = ram;
    }

    public Computer(double weight) {
        this.weight = weight;
    }

    public Computer(boolean cdReadable) {
        this.cdReadable = cdReadable;
    }

    public Computer(String name, int ram, int hdd, double weight, boolean cdReadable) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.cdReadable = cdReadable;
    }


/**********************************/



    public boolean isCdReadable() {
        return cdReadable;
    }

    public void setCdReadable(boolean cdReadable) {
        this.cdReadable = cdReadable;
    }

    private int width;



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

     if(!status.equals("running")) {
         print(name+ " : включился");
     } else {
         print(name+ " : невозможно включить. есть незавершенные задачи.");
     }
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

    public void rebootUserComps() {
        if(!adminComp) {
            System.out.println("У компьютера "+name+" нет прав на перезвгрузку. Это не админский компьютер.");
            return;
        }

        for(int i = 0; i < userComps.length; i++){
            userComps[i].reboot();
        }
        System.out.println();
    }

    public void shutdownUserComps() {
        if(!adminComp) {
            System.out.println("У компьютера "+name+" нет прав на включение. Это не админский компьютер.");
            return;
        }
        for(int i = 0; i < userComps.length; i++) {
            userComps[i].off();
        }
        System.out.println();
    }

    public void switchOnUserComps() {
        if(!adminComp) {
            System.out.println("У компьютера "+name+" нет прав на включение. Это не админский компьютер.");
            return;
        }
        for(int i = 0; i < userComps.length; i++) {
            userComps[i].on();
        }
        System.out.println();
    }

    private void print(String str) {
        System.out.println(str);
    }
}
