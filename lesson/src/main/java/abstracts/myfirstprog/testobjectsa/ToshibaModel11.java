package abstracts.myfirstprog.testobjectsa;

public class ToshibaModel11 extends Toshibas implements Planshet,Phone {
    @Override
    public void openCD() {
        System.out.println("OpenCD");
    }

    @Override
    public void closeCD() {
        System.out.println("Close CD");
    }

    @Override
    public void navigateByScreen() {
        System.out.println("Navigate by screen");
    }

    @Override
    public void call() {
        System.out.println("Call");
    }
}
