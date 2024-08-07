package Day_5;

public class LargestCombine {
    public static void main(String_1[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum =0;
        for (int i = 0; i < arr.length ; i+=2) {
           sum+=sum+arr[i];
                    System.out.println(sum);
                }
            }
}
