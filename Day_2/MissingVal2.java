package Day_2;

import java.util.Arrays;

public class MissingVal2 {
    public static void main(String[] args) {
        int arr[]={3,6,1,10,6};
        Arrays.sort(arr);
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( min >arr[i] ) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(min);
        System.out.println(max);
        for (int i = min; i < max; i++) {
            boolean demo = true;
            for (int j = 0; j < arr.length; j++) {
               if (i == arr[i]){
                   demo = false;
               }
               if (demo){
                   System.out.println(j);
               }
            }
        }
    }
}
