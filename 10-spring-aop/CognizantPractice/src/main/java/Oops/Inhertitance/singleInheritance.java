package Oops.Inhertitance;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited method
        d.bark(); // child’s own method

        zebra z = new zebra();
        z.eat();
        z.poop();
    }
}



class Animals{
    void eat(){
        System.out.println("Animals are eating!");
    }
}
class zebra extends Animals{
    void poop(){
        System.out.println("Zebra is pooping");
    }
}
