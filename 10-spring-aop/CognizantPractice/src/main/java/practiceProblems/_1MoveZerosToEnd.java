package practiceProblems;

import java.util.Arrays;
import java.util.Scanner;

public class _1MoveZerosToEnd {

    private int[] moveZeros(int[] nums){
        int l = 0,r=0;
        while (r < nums.length){
            if (nums[r]!=0){
                int temp = nums[r];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i =0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
