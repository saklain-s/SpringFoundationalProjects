package Strings;

public class equals {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Python";
        String s4 = "python";

        System.out.println(s1.equals(s2)); // f
        System.out.println(s3.equals(s4)); // f
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s2.compareTo(s3)); // 'J' - 'j' i.e 106 - 74

        System.out.println(s1.matches(s2));
    }
}
