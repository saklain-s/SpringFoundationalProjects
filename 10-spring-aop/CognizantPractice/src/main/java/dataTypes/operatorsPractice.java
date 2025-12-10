package dataTypes;

public class operatorsPractice {
    public static void main(String[] args) {
        char ch = 'A';
        int x = 1;
        System.out.println(ch+x); // int
        System.out.println(Integer.valueOf(ch));

        float f = 0.1f;
        System.out.println(x+f);

        long l = 1234567891858293828L; // 16 digits
        System.out.println(l+f); // result in float

        double d = 1.01010101001;
        System.out.println(f+d); // in double
    }
}
