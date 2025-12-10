package arrays;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int arr2[] = new int[arr.length];
        System.out.println(arr.length);

        System.out.println();

        for (int i = 0; i <= arr.length -1; i++){
            System.out.println(arr[i]);
        }


        System.out.println();

        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        int x =18;



        for (int i = 0; i < arr.length -1; i++){ // reads a values less
            System.out.println(arr[i]);
        }
    }
}
