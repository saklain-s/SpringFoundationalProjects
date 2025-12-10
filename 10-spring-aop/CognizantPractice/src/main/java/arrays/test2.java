package arrays;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int arr[] = new int[x];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int j:arr){
            System.out.println(j);
        }
    }
}
