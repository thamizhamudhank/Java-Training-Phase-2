package Day_2;

import java.util.Arrays;

public class Concat1 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr1[]={4,5,6};
        int n=0;
        int arr2[]=new int[arr.length+arr1.length];
        for (int i = 0; i <arr.length; i++) {
            arr2[n++]=arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[n++]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
