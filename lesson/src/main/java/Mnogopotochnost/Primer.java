package Mnogopotochnost;

public class Primer implements Runnable {
    @Override
    public void run() {
        System.out.println("Начинаем обработку в отдельном потоке - " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            // для примера будем выполнять обработку базы данных
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Заканчиваем обработку в отдельном потоке - " + Thread.currentThread().getName());
    }

    // метод псевдообработки базы данных
    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}

class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Primer(), "t1");
        Thread t2 = new Thread(new Primer(), "t2");
        t1.start();
        t2.start();
    }
}
