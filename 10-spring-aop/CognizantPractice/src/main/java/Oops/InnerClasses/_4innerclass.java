package Oops.InnerClasses;

interface Greeting{
    void sayHello();
}

public class _4innerclass {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymouse Inner Class");
            }
        };
        g.sayHello();
    }

}
