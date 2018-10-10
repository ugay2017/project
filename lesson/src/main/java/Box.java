public class Box {
    private int width;
    private int foot;
    private int height;

    public Box(int width, int foot, int height) {
        this.width = width;
        this.foot = foot;
        this.height = height;
    }
    double volume(){
        return width*foot*height;
    }

    public static void main(String[] args) {
        Box box = new Box(1,2,3);
        System.out.println(box.volume()) ;

    }
}
