package SHILDT;

public class Sar {

    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class Ras implements  Sar.NestedIF {
    public boolean isNotNegative(int x) {
        return x<0 ?false :true;
    }
}

class NestedDemo {
    public static void main(String[] args) {
        Sar.NestedIF nif = new Ras();
        if(nif.isNotNegative(10)){
            System.out.println("not отрицательное");
        }if(nif.isNotNegative(-12)){
            System.out.println("не будет выведено");
        }
    }
}