package Day_2;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]=new int[arr.length];
        int a=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[a++]=arr[i];
            }
        System.out.println(Arrays.toString(arr1));
    }
}
