package DSArefresg;

public class _4Linear_range {

    static int search(int arr[], int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,6,9,9,-1,10};
        System.out.println(search(arr,10,0,10));
    }
}
