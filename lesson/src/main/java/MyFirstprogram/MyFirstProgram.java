package MyFirstprogram;

import Inheritance.objects.Comp;
import Inheritance.objects.NoteBook;

public class MyFirstProgram {
    public static void main(String[] args) {
     //   Computer comp = new Computer();
//        comp.setName(null);
//        comp.setName("");
//        comp.setHdd(2048);
//        comp.setHdd(-2048);
//        comp.setName("IBM");

        //  comp.setRam(-1024);
//        comp.on();
//        comp.off();
//        comp.load();

               //  comp.setFactoryNumber("     ");


//        comp.readCD();
//        comp.setCdReadable(true);
//        comp.readCD();


      //  System.out.println(comp.getFactoryNumber());

//        NoteBook noteBook = new NoteBook("IBM");
//       noteBook.on();
//
//        Comp c =new NoteBook("iBC");
//        ((NoteBook) c).charge();
      //  noteBook.load();
       // noteBook.off();


        Comp notebook = new NoteBook("ASD");
        doSmth(notebook);


        Comp comp = new Comp("Computer");
        doSmth(comp);
    }

    public static void doSmth(Comp comp) {
        if(comp instanceof NoteBook) {
            ((NoteBook)comp).charge();
            ((NoteBook)comp).on();
        }else if(comp instanceof Comp) {
            comp.on();
        }

    }


}
