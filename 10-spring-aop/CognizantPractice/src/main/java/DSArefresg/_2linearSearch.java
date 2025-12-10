package DSArefresg;

public class _2linearSearch {

    static int search(int arr[], int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }

        }

        for (int element : arr){
            if (element == target){
                return element;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {56,575,283,2938,22};
        System.out.println(search(arr,22));
    }
}
