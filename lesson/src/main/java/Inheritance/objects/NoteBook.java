package Inheritance.objects;

import testobject.Computer;

public class NoteBook extends Comp {

    protected String aaa;

    public NoteBook(String name) {
        super(name);
    }

    public NoteBook(String name, boolean canWriteDvd){
        super(name, canWriteDvd);
    }



    public void charge(){
        System.out.println("NoteBook charging...");
    }


    public void on() {
        System.out.println("NoteBook is on():");
    }

    public void connect() {
        System.out.println("NoteBook connect(): ");
    }
}
