public class Loop {

    public static void main(String[] args) {
        Loop loop = new Loop();
        boolean expression = true;
        int count = 0;
       do{
            System.out.println(count);
            count++;

        }while(count<4);
        System.out.println("finish");
    }
}
