package Mnogopotochnost.SYNCRONISED;

public class Synchronised {

    public static void main(String[] args) throws Exception {
   Resource resource = new Resource();
   resource.i = 5;

    MyThread3 myThread3 = new MyThread3();
    MyThread3 myThread4 = new MyThread3();
    myThread3.setName("one");
    myThread3.setResource(resource);
    myThread4.setResource(resource);
    myThread3.start();
    myThread4.start();

    myThread3.join();
    myThread4.join();
        System.out.println(resource.i);

    }
}

class MyThread3 extends Thread {
Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }
}

class Resource {
    static int i;

    public static void changeStaticI() {
    }

    public synchronized void changeI(){
        int i = this.i;
        if(Thread.currentThread().getName().equals("one")){
            Thread.yield();
        }
        i++;
        this.i = i;
    }
}
