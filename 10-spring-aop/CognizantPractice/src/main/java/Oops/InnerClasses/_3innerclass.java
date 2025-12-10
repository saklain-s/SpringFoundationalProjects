package Oops.InnerClasses;

class Outer2{
    void outerMethod(){
        System.out.println("Inside outerMethod");

        // Local Inner Class
        class Local{
            void display(){
                System.out.println("Hello from Local Inner Class");
            }
        }
        Local local = new Local();
        local.display();
    }
}

public class _3innerclass {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.outerMethod();
//        new Outer2().outerMethod();
    }
}
