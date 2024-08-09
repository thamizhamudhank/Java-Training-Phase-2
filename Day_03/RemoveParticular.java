package Day_3;

import java.util.Arrays;

public class RemoveParticular {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        int num = 2;
        for (int i = 0; i < arr.length; i++) {
            if (num != i) {
                arr1[i] = arr[i];
            }
        }
            System.out.println(Arrays.toString(arr1));
    }
}
