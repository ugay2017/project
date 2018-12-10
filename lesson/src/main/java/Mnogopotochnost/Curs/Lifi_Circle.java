package Mnogopotochnost.Curs;

public class Lifi_Circle {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
       // Thread.sleep(1000);
        /*Приоритет отдается потоку  thread main*/
       // Thread.yield();

        myThread1.join();
        System.out.println("thread main");
    }
}

class  MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("thread 0");
    }
}