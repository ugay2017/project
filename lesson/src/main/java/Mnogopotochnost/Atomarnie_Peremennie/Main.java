package Mnogopotochnost.Atomarnie_Peremennie;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 100; i++){
            new MyThread().start();
        }
        Thread.sleep(2000);
        System.out.println(atomicInteger.get());
    }


    static class MyThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }
}
