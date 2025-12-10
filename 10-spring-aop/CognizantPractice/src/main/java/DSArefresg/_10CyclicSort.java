package DSArefresg;

import java.util.Arrays;

public class _10CyclicSort {

    void cyclicSort(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);

            }
            else {
                i++;
            }
        }
    }
    private   void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0};
        _10CyclicSort cycli = new _10CyclicSort();
        cycli.cyclicSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
