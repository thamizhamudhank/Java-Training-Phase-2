package Day_4;

public class AddOfThree {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int num=7;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <i; j++) {
                for (int k = 0; k <j ; k++) {
                    if(num==arr[i]+arr[j]+arr[k]){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }

            }

        }
    }
}
