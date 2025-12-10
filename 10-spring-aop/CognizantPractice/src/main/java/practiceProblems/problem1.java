package practiceProblems;

public class problem1 {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int num = n;

        while (num > 0){
            if(digits(num) != 0 && digits(n) == 0){
                count++;
            }
            num /= num;
        }

        return count;
    }
    private static int digits(int n){
        n %= 10;
        return n;
    }

    public static void main(String[] args) {
        evenlyDivides(12);
    }
}
