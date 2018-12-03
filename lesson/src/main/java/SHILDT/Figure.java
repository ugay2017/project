package SHILDT;

abstract public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("В области четырехугольника");
        return dim1  * dim2;
    }
}

class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
    }
}

class AbstractAreas {
    public static void main(String[] args) {
       // Figure f = new Figure(10,20);
        Rectangle r = new Rectangle(10,20);
        Triangle t = new Triangle(20,30);
        Figure figref;// но объект не создается

        figref = r;

        System.out.println(figref.area());

        figref = t;
        System.out.println(figref.area());
    }
}