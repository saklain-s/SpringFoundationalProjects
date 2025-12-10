package Oops.InnerClasses;

class Outer{
    private String msg = "Hello from Outer class";

    // Inner class
    class Inner{
        void display(){
            System.out.println(msg);
        }
    }
}
public class _1innerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
