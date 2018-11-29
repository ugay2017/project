package SHILDT;

public class VarArgs2 {

    static void vaTest(String msg, int...v) {
        System.out.println(msg+v.length+" Sodergimoe :");

        for(int x : v){
            System.out.println(x+" ");

            System.out.println();
        }


    }

    public static void main(String[] args) {
        vaTest("One",10);
        vaTest("Two",1,2,3);
        vaTest("Three",56);
    }
}
