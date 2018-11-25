package SHILDT;

public class Factorial {

    int fact(int n) {
        int result;

        if(n==1){
            return 1;
        }

        result = fact(n-1)*n;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorail 3 = "+f.fact(3));
        System.out.println("Factorail 4 = "+f.fact(4));
        System.out.println("Factorail 5 = "+f.fact(5));
    }
}