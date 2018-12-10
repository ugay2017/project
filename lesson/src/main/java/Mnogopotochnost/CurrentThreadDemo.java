package Mnogopotochnost;

public class CurrentThreadDemo {

    public static void main(String[] args) {
        /*сылка на текущий поток исполнения получается в результате вызова метода currentThread()
        * и сохраняется в локальной переменной t
        * */
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: "+t);

        t.setName("Mu Thread ");
        System.out.println("Посл изменения имени потока "+t);

        try {
            for(int i = 5; i>0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
