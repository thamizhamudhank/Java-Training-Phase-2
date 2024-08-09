package Day_3;

public class AddOfTwo {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int num=5;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <i; j++) {
                if(num==arr[i]+arr[j]){
                    System.out.println(arr[i]+","+arr[j]);
                }

            }
        }
    }
}
