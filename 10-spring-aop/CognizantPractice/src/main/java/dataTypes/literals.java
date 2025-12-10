package dataTypes;
import methods.test1;

import java.math.BigDecimal;

public class literals {
    public static void main(String[] args) {
        int x = 100-1;
        System.out.println(x);
        long l = 999_999_999;
        System.out.println(l);

        float f = 125_678_899.56f;
        System.out.println(f);



        float b = 15.020_302_030_302f;
        System.out.println(b);

        double d = 15.020_302_030_302;
        System.out.println(d);

        double d1 = 0.1;
        double d2 = 0.2;

        double sum = d1 + d2;

        System.out.println(sum); // error value as it does rounding

        BigDecimal decimal1 = new BigDecimal("0.1");
        BigDecimal decimal2 = new BigDecimal("0.2");

        System.out.println(decimal1.add(decimal2)); // give exact value

        int a = 15, c = 17, e = 21;
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(c));
        System.out.println(Integer.toBinaryString(e));

        test1 t = new test1();
        t.add(a,c);
       // t.max(a,c);

        int ab = 2;
        System.out.println(ab & 1);



    }
}
