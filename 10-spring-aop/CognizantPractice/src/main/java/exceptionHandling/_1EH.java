package exceptionHandling;

public class _1EH {
    public static void main(String[] args) {
        try {
            int result = 10/0;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Program continues");
    }
}
