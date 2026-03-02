import java.util.*;

public class revision {

    public static void decPrint(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        decPrint(n - 1);
    }

    public static void incPrint(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        incPrint(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fn1 = fact(n - 1);
        int fn = n * fn1;
        return fn;
    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Sm1 = calcSum(n - 1);
        int Sn = n + Sm1;
        return Sn;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        // decPrint(n);
        // System.out.println();
        // incPrint(n);
        // System.out.println(fact(n));
        // System.out.println(calcSum(n));
        System.out.println(fib(25));
        System.out.println(fib(24));
        System.out.println(fib(23));



    }
}