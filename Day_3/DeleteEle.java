package Day_3;

public class DeleteEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        int num = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arr1[i] = arr[i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}