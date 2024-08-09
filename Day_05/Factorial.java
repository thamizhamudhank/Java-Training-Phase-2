package Day_5;

public class Factorial {
    public static void main(String_1[] args) {
        int arr[]={1,2,3,4,5,6};
        int f=1;
        int result=0;
        for (int i = 0; i <arr.length; i++) {
            result=f*arr[i];
        }
        System.out.println(result);
    }
}
