package Lessonses.Circle.Exceptions_2.Throw;

public class PerimetrSquare {

    public void getPerimetr() {
        Square square = new Square();
        try {
            square.setSide(0);
        } catch (PerimeterException e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
