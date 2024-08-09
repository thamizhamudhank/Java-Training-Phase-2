package Day_5;

import java.util.Arrays;

public class countnum {
    public static void main(String_1[] args) {
        int a [] = { 10,30,27,10,10,30};
        Arrays.sort(a);
        int k=0;
        for (int i = 0; i < a.length; i++) {
            int count =0;
            if (k!= a[i]){
                for (int j =0 ; j<a.length;j++){
                    if (a[i] == a[j]){
                        count++;
                        k=a[j];
                    }
                }
                System.out.println("Count of "+a[i]+" "+count);
            }


        }
    }
}
