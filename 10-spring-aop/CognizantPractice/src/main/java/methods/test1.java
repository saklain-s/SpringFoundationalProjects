package methods;

public class test1 {

    public  int add(int x, int y){
        return x+y;
    }
    static int max(int a, int b){
        if (a > b){
            return a;
        }
        else
            return b;
    }
    public static void main(String[] args) {
        test1 t = new test1();
        int a = 10, b = 12;
        System.out.println(t.add(a,b));
        System.out.println(t.max(a,b));
    }
}
