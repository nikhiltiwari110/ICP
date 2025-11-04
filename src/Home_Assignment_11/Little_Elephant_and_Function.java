package Daily_Practise.Codeforces;

import java.util.Scanner;

public class Little_Elephant_and_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = i+1;
        }
        fun(arr,n-1);
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void fun(int [] arr, int n){
        if(n==0){
            return;
        }
        //swap
        int t = arr[n];
        arr[n] = arr[n-1];
        arr[n-1] = t;
        fun(arr,n-1);
    }
}
