package Day_4;

public class Average {
    public static void main(String[] args) {
        int arr[]={2,2,2,2};
        double sum=0 ;
        double Average=0;
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
            Average=sum/ arr.length;
        }
        System.out.println(Average);
    }
}
