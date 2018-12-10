package Mnogopotochnost.SYNCRONISED;

public class Synchronised_Medhod {
    public static void main(String[] args) throws Exception {

            Resource.i = 5;

            MyThread5 myThread3 = new MyThread5();
            MyThread5 myThread4 = new MyThread5();
            myThread3.setName("one");

            myThread3.start();
            myThread4.start();

            myThread3.join();
            myThread4.join();
            System.out.println(Resource.i);

        }
    }

    class MyThread5 extends Thread {
        Resource resource;



        @Override
        public void run() {
            Resource.changeStaticI();
        }
    }

    class Resource2 {
        static int i;

        public synchronized static void changeStaticI(){
            int i = Resource.i;
            if(Thread.currentThread().getName().equals("one")){
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }


