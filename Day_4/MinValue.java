package Day_4;

import java.util.Arrays;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {3,4,5, 5,6};
        Arrays.sort(arr);
        int minval = arr[0];
        int minval1 = arr[1];
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            if(minval>arr[i]){
                minval=arr[i];
            }
            if(minval!=arr[i]){
                minval1=arr[i];
                break;
            }
            }
        System.out.println("second min diff " + minval1 );
        }
    }