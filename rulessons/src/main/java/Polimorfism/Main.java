package Polimorfism;

public class Main {

    void useCar(Rac rac){
        rac.driving();
        System.out.println(rac.getNumOfSeets());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.useCar(new Rac());

        /*Полиморфизм вызвватеся объект класса Youta Доступные методы класса Youta*/
        Rac rac = new Youta();
        main.useCar(rac);



            Rac r= new Rac();
            System.out.println(r.getNumOfSeets());

            Youta youta = new Youta();
            System.out.println(youta.getNumOfSeets());
    }

}
