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

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i = 2; i<=n-1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for(int i = 2; i<=n; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void bintoDec(int binNum) {
        int pow = 0;
        int myNum = binNum;
        int decNum = 0;

        while(binNum>0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        } 
        System.out.println("The decimal conversition of binary number " + myNum + " = "+ decNum);

    }


    public static void dectoBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int rem = 0;
        int binNum = 0;

        while(decNum>0) {
            rem = decNum % 2;
            binNum = binNum + (int)(rem * Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }

        System.out.println("The binary number of the decimal number " + myNum + " = " + binNum );
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
        // System.out.println(binoCoeff(10, 10));    
 
        //FUNCTION OVERLOADING
        // System.out.println(sum(5,2));
        // System.out.println(sum(4.3f,2.7f));

        // System.out.println(isPrime(2));          
        
        //PRINTING PRIME NUMBERS IN RANGE
        // primeInRange(16);


        //BINARY TO DECIMAL
        // bintoDec(101);


        //DECIMAL TO BINARY
        dectoBin(7);


        }
}