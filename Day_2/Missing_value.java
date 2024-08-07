package Day_2;

import java.util.Arrays;

public class Missing_value {
    public static void main(String[] args) {

        int []arr = {1, 2, 4, 5 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] != arr[i + 1] - 1) {
                System.out.println(arr[i] + 1);
            }
        }
    }
}
