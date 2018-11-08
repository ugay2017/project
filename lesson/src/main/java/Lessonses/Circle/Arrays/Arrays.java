package Lessonses.Circle.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        char character='a';

        /*equals*/
        String s="Hello";
        String s1 = new String("Hi");
        int [] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=21;
        numbers[2]=22;
        numbers[3]=23;
        numbers[4]=24;

        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
       int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        System.out.println(sum);


        int [] n={1,2,3,4,5,6};
int sun = 0;
for(int x:n){
    sun+=x;
}

        System.out.println("Sun = "+sun);



    }
}
