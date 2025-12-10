package Oops.polymorphism;

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    @Override
    void run(){
        System.out.println("Bike is running safely");
    }
}

public class Upcasting {

    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.run();


    }
}
