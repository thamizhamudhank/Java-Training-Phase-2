package Day_2;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2,3, 1, 1,3,4};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count >=1) {
                System.out.println(arr[i]);
            }
        }
    }
}
