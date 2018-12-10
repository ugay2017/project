package Mnogopotochnost.Curs;

public class Main {
    public static void main(String[] args) {
       //otherMethod();

        //MyThread myThread = new MyThread();
       // myThread.start();
       new MyThread().start();

        /*        myThread.start();
         нельзя сдлать повторный вызов потока
         */

        System.out.println(Thread.currentThread().getName());

   MyRunnabel myRunnabel = new MyRunnabel();
   Thread thread2 = new Thread(myRunnabel);
   thread2.start();
    }


}

class MyThread extends Thread {
    @Override
    public void run() {
      //  System.out.println(Thread.currentThread().getName());

    for(int i = 0; i<10; i++) {
        System.out.println("Thread name is - "+Thread.currentThread().getName()+" i= "+i );
    }
    }

    private static void otherMethod() {
        throw new RuntimeException();
    }
}

class MyRunnabel implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
