package Oops.polymorphism;

class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a square");
    }
}

public class ArrayObjects {
    public static void main(String[] args){

//        Shape s;
//
//        s = new Shape();
//        s.draw();
//
//        s = new Circle();
//        s.draw();
//
//        s = new Square();
//        s.draw();

        Shape[] shapes = {new Circle(), new Square(), new Shape()};

        for(Shape s: shapes) {
            s.draw();
        }
    }
}
