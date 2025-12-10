package Oops.Inhertitance;

class Vehicle2{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class car2 extends Vehicle2{
    void drive(){
        System.out.println("Car is driving");
    }
}

class bike extends Vehicle2{
    void ride(){
        System.out.println("Bike is riding");
    }
}

public class Hierarchical {
    public static void main(String[] args) {

        car2 c = new car2();
        c.start();
        c.drive();

        bike b = new bike();
        b.start();
        b.ride();
    }
}
