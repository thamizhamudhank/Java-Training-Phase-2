package Day_4;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        Arrays.sort(arr);
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxval <arr[i]){
                maxval =arr[i-1];
            }
        }
        System.out.println("second max  " + maxval);
    }
}
