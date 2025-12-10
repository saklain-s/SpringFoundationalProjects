package Oops.Abstraction;

abstract class Animal1 {
    abstract void sound();  // abstract method

    void sleep() {         // concrete method
        System.out.println("Sleeping...");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks!");
    }
}

public class _3example {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.sound();   // must override
        d.sleep();   // inherited as-is
    }
}
