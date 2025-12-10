package DSArefresg;

import java.util.Arrays;

public class _7find2D {
    static int[] search(int arr[][], int t){
        if (arr.length == 0){
            return new int[] {-1};
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == t){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1};

    }

    public static void main(String[] args) {
        int arr [] [] = {{223,23,23},{23,53,1,23,35,23},{28,7,86,64}};

        System.out.println(Arrays.toString(search(arr,64)));
    }
}
