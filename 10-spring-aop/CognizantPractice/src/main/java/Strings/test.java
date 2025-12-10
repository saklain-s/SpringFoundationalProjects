package Strings;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 10, y = 20;
        float f = 3.1012f;
        char ch = 'A';

        System.out.printf("%d %d %d %.2f %c\n",x,x,x,f,ch);

        System.out.println(x+y+" sum");
        System.out.println("Sum "+x+y);
        System.out.println("Sum "+(x+y));

        int z = -10;
        System.out.printf("%d\n",z);
        System.out.printf("%(d\n",z); // prints plus value even though it's minus

        String s2 = Integer.toString(z);
        System.out.println(s2);

        for(char ch2 = s2.charAt(0); ch2 < s2.length(); ch++){
        }

    }
}
