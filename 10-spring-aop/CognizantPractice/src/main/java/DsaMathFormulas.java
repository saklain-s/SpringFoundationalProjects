public class DsaMathFormulas {

    // 1. Sum of first n natural numbers
    static void sumNaturalNumbers(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("1) Sum of first " + n + " natural numbers = " + sum);
    }

    // 2. Sum of first n odd numbers
    static void sumOddNumbers(int n) {
        int sum = n * n;
        System.out.println("2) Sum of first " + n + " odd numbers = " + sum);
    }

    // 3. Sum of squares of first n numbers
    static void sumSquares(int n) {
        int sum = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println("3) Sum of squares up to " + n + " = " + sum);
    }

    // 4. Sum of cubes of first n numbers
    static void sumCubes(int n) {
        int sum = (int) Math.pow((n * (n + 1)) / 2, 2);
        System.out.println("4) Sum of cubes up to " + n + " = " + sum);
    }

    // 5. Number of subarrays in an array
    static void countSubarrays(int n) {
        int subarrays = n * (n + 1) / 2;
        System.out.println("5) Number of subarrays in array of size " + n + " = " + subarrays);
    }

    // 6. Contribution technique (sum of all subarray sums)
    static void sumAllSubarraySums(int[] arr) {
        int n = arr.length;
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += (long) arr[i] * (i + 1) * (n - i);
        }
        System.out.println("6) Sum of all subarray sums = " + total);
    }

    // 7. Subsets of an array (2^n)
    static void generateSubsets(int[] arr) {
        int n = arr.length;
        int total = 1 << n; // 2^n
        System.out.println("7) Subsets:");
        for (int mask = 0; mask < total; mask++) {
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("}");
        }
    }

    // 8. Combinations (nCr)
    static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) res *= i;
        return res;
    }

    static void computeNCR(int n, int r) {
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("8) C(" + n + ", " + r + ") = " + ncr);
    }

    // 9. Permutations (nPr)
    static void computeNPR(int n, int r) {
        int npr = factorial(n) / factorial(n - r);
        System.out.println("9) P(" + n + ", " + r + ") = " + npr);
    }

    // 10. GCD & LCM
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static void computeGcdLcm(int a, int b) {
        int g = gcd(a, b);
        int lcm = (a * b) / g;
        System.out.println("10) GCD(" + a + "," + b + ") = " + g + ", LCM = " + lcm);
    }

    // 11. Number of digits
    static void countDigits(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        System.out.println("11) Digits in " + n + " = " + digits);
    }

    // 12. Sum of AP
    static void sumAP(int a, int d, int n) {
        int sum = n * (2 * a + (n - 1) * d) / 2;
        System.out.println("12) Sum of AP (a=" + a + ", d=" + d + ", n=" + n + ") = " + sum);
    }

    // 13. Sum of GP
    static void sumGP(int a, int r, int n) {
        if (r == 1) {
            System.out.println("13) Sum of GP = " + (a * n));
        } else {
            double sum = a * (Math.pow(r, n) - 1) / (r - 1);
            System.out.println("13) Sum of GP (a=" + a + ", r=" + r + ", n=" + n + ") = " + sum);
        }
    }

    // 14. Trailing zeros in factorial
    static void countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        System.out.println("14) Trailing zeros in " + n + "! = " + count);
    }

    // 15. Catalan number (for BSTs, parentheses problems)
    static void catalanNumber(int n) {
        int cat = factorial(2 * n) / (factorial(n + 1) * factorial(n));
        System.out.println("15) Catalan number C(" + n + ") = " + cat);
    }

    public static void main(String[] args) {
        // Call all methods with sample inputs
        sumNaturalNumbers(10);
        sumOddNumbers(5);
        sumSquares(5);
        sumCubes(5);
        countSubarrays(4);
        sumAllSubarraySums(new int[]{1, 2, 3});
        generateSubsets(new int[]{1, 2, 3});
        computeNCR(5, 2);
        computeNPR(5, 2);
        computeGcdLcm(12, 18);
        countDigits(12345);
        sumAP(2, 3, 5);
        sumGP(2, 2, 4);
        countTrailingZeros(100);
        catalanNumber(4);
    }
}
