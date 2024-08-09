package Day_2;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        int temp=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <i; j++) {
                if (arr[i]<arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
