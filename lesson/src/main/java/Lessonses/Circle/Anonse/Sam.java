package Lessonses.Circle.Anonims;

 class Mast {
    public void eat() {
        System.out.println("Sam eat");
    }
 }


 class Other extends Mast {
     public void eat() {
         System.out.println("OtherAnimal is eating ...");
     }
 }

public class Sam {
    public static void main(String[] args) {
Mast mast =new Mast();
mast.eat();


        System.out.println("-/*//*");
/*ANONIMS*/
        Mast mast2 = new Mast(){
            public void eat(){
                System.out.println("OtherAnimal is eating ..");
            }
        };

        mast2.eat();

    }
}
