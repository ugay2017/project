package SHILDT;

public class VarArgs3 {
    static void vaTest(int...v) {
        System.out.println("vaTest(int ...) :"+"Collichestvo"+
                v.length+" Sodergimoe");

        for(int x : v){
            System.out.println(x+ " ");

            System.out.println();
        }


    }

    static void vaTest(boolean ...v) {
        System.out.println("vaTEst(boolean...) :"+" Col-vo argumentov"+ v.length+" Sodergimoe :");

    for(boolean x:v){
        System.out.println(x+" ");

        System.out.println();
    }
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true, false, false);
        vaTest(123);
    }
}
