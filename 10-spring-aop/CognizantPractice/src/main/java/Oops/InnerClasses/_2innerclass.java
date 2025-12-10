package Oops.InnerClasses;

class Outer1{
    static String msg = "Hello from Outer";

    static class Nested{
        void show(){
            System.out.println(msg);
        }
    }
}

public class _2innerclass {
    public static void main(String[] args) {
        Outer1.Nested obj = new Outer1.Nested();
        obj.show();
    }
}
