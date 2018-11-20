package BLOCK_INITIALIZER;


class Parent {
    static {
        System.out.println("static parent block");
    }
    Parent() {
        System.out.println("Parent constructor");
    }
}

public class InitExample extends Parent {
    static {
        System.out.println("static init block");
    }
    {
        System.out.println("init block");
    }
    {
        System.out.println("init block2");
    }
    InitExample() {
        super();
        System.out.println("constructor1");
    }

    public static void main(String[] args) {
        new InitExample();
    }
        {
            System.out.println("init block 3");
        }
        static{
            System.out.println("static init block 2");
        }
    }


/*Вот такой вывод
* static init block
Parent constructor
init block
constructor1*/


/* Vivod
static parent block
static init block
static init block 2
Parent constructor
init block
init block2
init block 3
constructor1
*/