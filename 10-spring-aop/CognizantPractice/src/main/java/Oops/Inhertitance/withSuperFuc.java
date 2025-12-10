package Oops.Inhertitance;


class person{
    person(){
        System.out.println("serson Constructor");
    }
}
class student extends person{
    student(){
        super(); // optional
        System.out.println("student Constructor");
    }
}

class xerson{
    xerson(String name){
        System.out.println("Person Constructor "+name);
    }
}

class xtudent extends xerson{
    xtudent(){
        super("Saklain");
        System.out.println("Student Constructor");
    }
}
public class withSuperFuc {
    public static void main(String[] args) {
        student s = new student();

        System.out.println("-----------");

        xtudent sc = new xtudent();

    }
}
