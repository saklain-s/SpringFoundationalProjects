package Oops.Abstraction;

abstract class Animal{
    // Abst
    abstract void sound();

    void sleep(){
        System.out.println("Animal is sleeping");
    }

}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}
public class _1abstraction {
    public static void main(String[] args) {
       // Animal a = new Animal(); // not allowed

        Animal a1;
        a1 = new Dog();
        a1.sound();
        a1.sleep();

        a1 = new Cat();
        a1.sound();
        a1.sleep();
    }

}
