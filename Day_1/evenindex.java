package Day_1;

public class evenindex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {

                System.out.println(arr[i]);
            }
        }
    }
}