package arrays;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n =     1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){ // or j < arr.length both works same
                arr[i][j] = sc.nextInt();
                // arr[i][j] = n; n++;
            }
        }

        for (int[] a: arr){
            for (int y: a){
                System.out.println(y);
            }

        }
    }
}
