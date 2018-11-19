public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(1,2,3);
        Box box2 = new Box(4,5,6);

        double vol;

        vol = box1.volume();
        System.out.println("Объем равен "+vol);

        vol = box2.volume();
        System.out.println("Объем равен "+ vol);
    }
}
