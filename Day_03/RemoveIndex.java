package Day_3;

import java.util.Arrays;

public class RemoveIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length-1];
        int num = 2;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != num) {
                arr1[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}
