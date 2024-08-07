package Day_1;

public class Array {
    public static void main(String[] args) {
        int arr [] ={70,80,90,68};
        int min =arr[0];
        for (int i = 0; i <arr.length ; i++    ) {
                if (arr[i]< min) {
                min=arr[i];
                }
        }
        System.out.println("maximum is :" + min);
    }
}
