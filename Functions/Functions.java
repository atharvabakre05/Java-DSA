import java.util.*;
import java.util.Scanner;
public class Functions {

    public static void printHelloWorld() {
        System.out.println("Hello World");
        return;     
    }

    public static int calculateSum(int num1, int num2 ) {
        int sum = num1 + num2;
        return sum; 
    }
    
    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp; 
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);   
    }

    public static int product(int a, int b){
        int mul;
        mul = a*b;
        System.out.println("The product is : " +mul);
        return mul;
    }

    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binoCoeff = fact_n/(fact_r * fact_nmr);
        return binoCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PRINT HELLO WORLD FUNCTION
        // printHelloWorld();

        //SUM OF TWO NUMBER FUNCTION
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number:");
        // int a = sc.nextInt();
        // System.out.println("Enter second number:");
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b);
        // System.out.println("The sum is: " + sum);

        //SWAP FUNCTION
        // swap(5, 10);

        //PRODUCT FUNCTION
        // product(10,10);

        //FACTORIAL FUNCTION & BINOMIAL COEFF
        
        // System.out.println(factorial(4));
        //Formula for binomial coeff = n!/(r)!*(n-r)!

        System.out.println(binoCoeff(10, 10));    
 




        }
}