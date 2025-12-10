package DSArefresg;

public class _6findMin2D {

    static int min(int arr[][]){
        if (arr.length==0){
            return -1;
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr [] [] = {{223,23,23},{23,53,1,23,35,23},{28,7,86,64}};
        System.out.println(min(arr));
    }
}
