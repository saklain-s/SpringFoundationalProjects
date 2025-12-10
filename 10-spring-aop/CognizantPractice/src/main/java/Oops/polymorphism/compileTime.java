package Oops.polymorphism;

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class compileTime {

    public static void main(String[] args) {
        Calculator c =  new Calculator();
        System.out.println(c.add(4,550));
        System.out.println(c.add(5.55,523.3433));
        System.out.println(c.add(10,20,30));
    }

}
