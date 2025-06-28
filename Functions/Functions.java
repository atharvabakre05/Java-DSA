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


    public static void main(String[] args) {
        // printHelloWorld();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number:");
        // int a = sc.nextInt();
        // System.out.println("Enter second number:");
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b);
        // System.out.println("The sum is: " + sum);
        // swap(5, 10);
        
        product(10,10);



    }
}
