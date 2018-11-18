package Perechislenia;

public class EnumExample {
    enum CoffeSize  {SMALL(100),BIG(300) ,MEDIUM(200) {
        String getCoffeClass() {
            return "B";
        }
    };



        int millilitres;
        String coffeClass = "A";
    CoffeSize(int i) {
        this.millilitres = i;
    }
    int getMillilitres() {
        return millilitres;
        }
        String getCoffeClass() {
           return coffeClass;
        }
    }

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.MEDIUM;
        System.out.println(coffeSize);
        System.out.println(coffeSize.getMillilitres());
        System.out.println(coffeSize.getCoffeClass());
    }
}
