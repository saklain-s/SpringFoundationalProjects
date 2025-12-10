package methods;

import java.util.Arrays;

public class test3 {
   static int change(int a){

        return a = 10;
    }
    static void change(int arr[]){
       arr[0] = 795;
    }

    static void welcome(String str){
        System.out.println("Welcome Mr/Ms "+str);
    }

    static String welcome2(String str){
       return "Welcome Mr/Ms " + str;
    }

    public static void main(String[] args) {
        int a = 99;
        System.out.println(change(a));
        System.out.println(a);

        int arr[] = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

        String str = "Roman";
        welcome(str);

        System.out.println(welcome2(str));
    }
}
