package Strings;

public class regularExpresions {
    public static void main(String[] args) {
        String str = "saklain";
        System.out.println(str.matches(".......")); // 7 characters

        System.out.println("hello".matches(".*"));  // true (any length string)
        System.out.println("".matches(".*"));       // true (even empty string)
        System.out.println("java".matches(".+"));   // true (at least one char)
        System.out.println("".matches(".+"));       // false (empty string not allowed)

        str = "saklain";

        System.out.println(str.matches("[aiklns]+"));

        String str2 = "p";
        System.out.println(str2.matches("[^abc]"));

        System.out.println(str.matches("[a-z]+"));
        System.out.println("s".matches("[a-z]"));       // true (one char)
        System.out.println("sa".matches("[a-z]"));      // false (more than one)
        System.out.println("sa".matches("[a-z]+"));     // true (two lowercase chars)
        System.out.println("saklain".matches("[a-z]+"));// true (all lowercase)

        String a = "b";
        System.out.println(a.matches("a|b"));


    }
}
