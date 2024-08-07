package Day_3;


public class MinDiff {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 4, 4};
        int val = 100;
        int minval = arr[0];
        int minval1 = arr[1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] - arr[j] < val && arr[i] > arr[j]) {
                    val = arr[i] - arr[j];
                    minval = arr[i];
                    minval1 = arr[j];
                }
                if (arr[j] - arr[j] < val && arr[j] > arr[i]) {
                    val = arr[j] - arr[i];
                    minval = arr[i];
                    minval1 = arr[j];
                }
            }
            if (arr[i] > minval) {
                break;
            }
        }
            System.out.println("second min diff of " + minval + " and  " + minval1 + " is " + val);
        }
}