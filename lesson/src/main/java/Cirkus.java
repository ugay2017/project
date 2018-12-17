public class Cirkus {
    public static void main(String[] args) {

        int i = 1;
        while (i < 10) {
            System.out.print(i+" " );
            int j = 1;
            while (j < 10) {
                int mul = i * j;
                    if (mul < 10)
                       System.out.print(mul+" ");
                    else
                       System.out.print(mul+" ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
