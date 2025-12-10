package Oops.polymorphism;

class Animal{
    void Sound(){
        System.out.println("Animals make sound!");
    }
}

class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void Sound(){
        System.out.println("Cat meows");
    }
}
public class runTime {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.Sound();

        a = new Cat();
        a.Sound();

        a = new Animal();
        a.Sound();


    }
}
