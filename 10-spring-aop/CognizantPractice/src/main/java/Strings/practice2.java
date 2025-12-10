package Strings;

public class practice2 {
    public static void main(String[] args) {
        char c[] = {'A','B','C','D'};

        String str = new String(c);
        System.out.println(str);

        byte[] b = {65,66,67,68,69};
        String str1 = new String(b);
        System.out.println(str1);

        String str2 = new String(b,1,4);
        System.out.println(str2);
    }
}
