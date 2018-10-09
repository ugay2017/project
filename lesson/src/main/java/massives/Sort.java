package massives;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] numbers = new int[]{112,232,1212,12392};

     //   System.out.println(Arrays.sort(numbers));
      /*
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));*/

    numbers[1] = 1212;
    numbers[2] = 232;

        System.out.println(Arrays.toString(numbers));

        int max =numbers[0];

        for(int i = 0; i<numbers.length; i++){
            if(max<numbers[i]){
             max=numbers[i];
            }
        }
        System.out.println(max);


        int min=numbers[0];

        for(int i=0; i<numbers.length; i++) {
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println(min);



        for (int i = 0; numbers.length/2 > i; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length - i -1];
            numbers[numbers.length - i-1] = tmp;
        }
        System.out.println(Arrays.toString(numbers));



    }

}
