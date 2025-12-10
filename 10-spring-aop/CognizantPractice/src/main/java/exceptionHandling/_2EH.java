package exceptionHandling;

public class _2EH {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[5] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
      }

        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
