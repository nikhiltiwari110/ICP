package Home_assignment_2;

import java.util.Scanner;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        long lo = 1;
        long hi = num;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid>num){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return false;
    }
}
