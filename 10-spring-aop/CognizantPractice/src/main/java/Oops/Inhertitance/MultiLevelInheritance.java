package Oops.Inhertitance;

class Vehicle{
    void Start(){
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car{
    void turbo(){
        System.out.println("SportsCar in turbo mode!");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();

        sc.Start();
        sc.drive();
        sc.turbo();
    }
}
