package Day_3;

public class Index {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int[] arr1=new int[arr.length];
        int num = 2;
        int k =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arr1[k++] = arr[i];
            }
        }
        for (int i = 0; i < arr1.length-1; i++) {
            System.out.println(arr1[i]);
        }
    }
}
