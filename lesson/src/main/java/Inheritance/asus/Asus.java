package Inheritance.asus;

import Inheritance.objects.NoteBook;

public class Asus extends NoteBook {

    public Asus(String name) {
        super(name);
    }

    public Asus(String name, boolean canWriteDvd) {
        super(name, false);
    }
}
