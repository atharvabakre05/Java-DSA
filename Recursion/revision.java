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

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fm1 = fact(n-1);
        int fn = n*fm1;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        // decPrint(n);
        // System.out.println();
        // incPrint(n);
        System.out.println(fact(n));


    }
}