/*
 * Write a recursive mothord that implements the Fibbonacci funtion
 * f_n = f_n-1 + f_n-2  n>1
 * f_1 = 1
 * f_0 = 0
 */

public class Prog17_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }

    }
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
//We should never use recursion for this problem. It is too slow. We should use a loop instead.
