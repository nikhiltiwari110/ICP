package Home_assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int [] arr = {-1,-1};
        int hi = nums.length - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target>nums[mid]){
                lo = mid + 1;
            }else if(target<nums[mid]){
                hi = mid - 1;
            }else{
                arr[0] = mid;
                // check for left
                hi = mid -1;
            }
        }
        lo = 0;
        hi = nums.length - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target>nums[mid]){
                lo = mid + 1;
            }else if(target<nums[mid]){
                hi = mid - 1;
            }else{
                arr[1] = mid;
                // check for right
                lo = mid + 1;
            }
        }
        return arr;
    }
}
