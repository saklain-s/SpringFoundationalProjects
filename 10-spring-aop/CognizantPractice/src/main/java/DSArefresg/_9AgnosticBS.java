package DSArefresg;

public class _9AgnosticBS {
    public static void main(String[] args) {
        int [] arr1 = {2,3,5,9,11,23,34};
        int [] arr2 = {34,23,11,9,5,3,2};

        System.out.println(orderAgnostic(arr1,23));
        System.out.println(orderAgnostic(arr2,23));
    }

    static int orderAgnostic(int arr[], int target){


        int start = 0;
        int end = arr.length-1;
        boolean asc = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start) /2;
            if(arr[mid] == target){
                return mid;
            }

            if (asc){
                if (target > arr[start]){
                    start = mid + 1;
                }
                else if (target < arr[mid]){
                    end = mid - 1;
                }
            }
            else {
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else if (target > arr[mid]){
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
