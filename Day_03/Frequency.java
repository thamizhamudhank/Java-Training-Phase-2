package Day_3;

public class Frequency {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 1, 2};
        int [] arr1= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr1[j]) {
                    flag=false;
                }
            }
            if(flag){
                int count=0;
                for (int k = 0; k <arr.length; k++) {
                    if(arr[i]==arr[k])
                    {
                        count++;
                    }
                }
                System.out.println("frequency of  " + arr[i] + "   " + count);
                arr1[i]=arr[i];
            }
        }
    }
}
