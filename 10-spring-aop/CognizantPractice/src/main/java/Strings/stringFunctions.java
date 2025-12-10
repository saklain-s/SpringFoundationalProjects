package Strings;

public class stringFunctions {
    public static void main(String[] args) {
        String str = "saklain_shaik";

        System.out.println(str.substring(8));
        System.out.println(str.substring(0,7));
        System.out.println(str.replace('k','q'));

        String str2 = "www.saklain.org";
        System.out.println(str2.startsWith("www"));//t
        System.out.println(str2.startsWith("w"));//t
        System.out.println(str2.endsWith("org"));//t
        System.out.println(str2.endsWith("g"));//t

        System.out.println(str2.charAt(2));

        System.out.println(str2.indexOf('w',2));
        System.out.println(str2.indexOf('.',4));
        System.out.println(str2.indexOf('&')); // -1

        System.out.println(str2.lastIndexOf('.'));
        System.out.println(str2.lastIndexOf('.',10));
        System.out.println(str2.length());
    }
}
