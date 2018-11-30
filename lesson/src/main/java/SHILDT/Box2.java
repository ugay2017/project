package SHILDT;

public class Box2{
    private double width;
    private double height;
    private double depth;

    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width*height*depth;
    }
}

class BoxWeight2 extends Box2  {
    double weight;

    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight2(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }

    BoxWeight2() {
        super();
        weight = -1;
    }
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight2 {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w,h,d,m);
        cost = c;
    }
    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(1,0,1,1,1.41);

        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен "+vol);
        System.out.println("Вес shipment1 равен "+shipment1.weight);

        System.out.println("Стоимость доставки : $ "+shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2 Равен "+vol);
        System.out.println("Вес shipment2 Равен "+shipment2.weight);
        System.out.println("Стоимость доставки : $ "+shipment2.cost);
    }
}