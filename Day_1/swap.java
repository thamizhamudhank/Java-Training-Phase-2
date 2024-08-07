package Day_1;

import java.util.Arrays;

public class swap{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
