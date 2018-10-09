package massives;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] arr={4,3,12,6,7,9,123};

        for(int i=arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
