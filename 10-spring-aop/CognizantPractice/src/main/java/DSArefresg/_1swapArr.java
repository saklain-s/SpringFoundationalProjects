package DSArefresg;

import java.util.Arrays;

public class _1swapArr {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int []arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int arr[], int s, int end){
        int temp = arr[s];
        arr[s] = arr[end];
        arr[end] = temp;

    }
}
