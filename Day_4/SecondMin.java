package Day_4;

import java.util.Arrays;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3,  1};
        Arrays.sort(arr);
        int minval = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (minval > arr[i] ) {
                minval = arr[i + 1];
            }
        }
        System.out.println("second min  " + minval);
    }

}