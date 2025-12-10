package methods;

public class MethodOverloading {


    static float max(float a, float b){
        return a > b ? a:b;
    }

    static int max(int x, int y, int z){
        return (x > y) ? (x > z ? x : z) : (y > z ? y : z);
    }

    static byte max(byte f, byte g){
        return f>g?f:g;
    }

    static int max(int a, int b){
        return a > b ? a:b;
    }

    static int max(int ...x){ // for N numbers or arguments of inputs
        int max = 0;
        for (int A: x){
            if (A > max){
                max = A;
            }
        }
        return max;
    }

    // this not overloading, just for practice
    static int sum(int ...x){ // for N number of inputs
        int sum = 0;
        for (int A: x){
            if (A > sum){
                sum += A;
            }
        }
        return sum;
    }


    public static void main(String[] args){
        System.out.println(max(10,29));
        System.out.println(max(10,29,40));
        System.out.println(max(2.0f,9.29f));
        System.out.println(max((byte) 1,(byte) 3)); // it treats integers first, if want to do it we need to use the narrowing

        System.out.println(max(1,2,3,3,4,4,5,5));
        System.out.println(max(1,2,3,4,323,32,3,4,5,5,555,8293));

        int arr [] = {75,238,583,232,32222}; // it will also take the array as arguments, you can give any number of arguments
        System.out.println(max(arr));


        System.out.println(sum(1,2,3,4,323,32,3,4,5,5,555,8293));

    }


}
