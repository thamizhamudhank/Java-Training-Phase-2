package Day_1;

public class max {
    public static void main(String[] args) {
        int arr [] ={70,80,90,68};
        int max =arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]> max) {
                max =arr[i];
            }
        }
        System.out.println("maximum is :" + max);
    }
}
