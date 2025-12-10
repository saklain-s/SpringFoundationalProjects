package Oops.polymorphism;
// Parent Class
class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Subclass 3
class Cow1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

public class AllApproaches{
    public static void main(String[] args) {
        // Approach 1: Direct object creation
        Dog1 d = new Dog1();
        d.sound();  // Dog barks

        Cat1 c = new Cat1();
        c.sound();  // Cat meows

        Cow1 cow = new Cow1();
        cow.sound();  // Cow moos

        // Approach 2: Using Parent reference
        Animal1 a1 = new Dog1();
        Animal1 a2 = new Cat1();
        Animal1 a3 = new Cow1();

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
        a3.sound();  // Cow moos

        // Approach 3: Using array of parent references
        Animal1[] animals = { new Dog1(), new Cat1(), new Cow1() };
        for (Animal1 a : animals) {
            a.sound();   // Calls overridden method at runtime
        }
    }
}
