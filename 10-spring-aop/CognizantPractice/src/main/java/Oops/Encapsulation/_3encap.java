package Oops.Encapsulation;
class Employee{
    private String name;
    private double salary;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary){
        if (salary > 0)
            this.salary = salary;
        else
            System.out.println("Salary must be positive");
    }
}
public class _3encap {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Saklain");
        e.setSalary(202022);

        System.out.println(e.getName() + " earns "+e.getSalary());
    }
}
