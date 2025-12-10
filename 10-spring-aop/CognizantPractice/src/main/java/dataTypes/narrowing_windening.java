package dataTypes;

public class narrowing_windening {
    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);

        // widening

        Short sh = 12;
        int x = sh;
        float y = x + .000001f;

        System.out.println(sh);
        System.out.println(x);
        System.out.println(y);

        // narrowing

        byte b;
        int z = 1000; // error cause > 127
        b = (byte) z;

        System.out.println(b);


    }
}
