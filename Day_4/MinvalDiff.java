package Day_4;

import java.util.Arrays;

public class MinvalDiff {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7};
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
            a=minval1-minval;
        }
        System.out.println("Diff btw two min value is "+a);
    }
}
