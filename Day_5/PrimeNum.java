package Day_5;

public class PrimeNum {
    public static void main(String_1[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int result=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%i==0){
                result++;
            }
        }
        if(result==0){
            System.out.println("it is prime");
        }
    }
}
