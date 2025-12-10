package exceptionHandling;

public class _3EH {
    public static void main(String[] args){
        try {
            int num = 100 / 0;
            System.out.println(num);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
