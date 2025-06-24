import java.util.*;
public class Loops {
    public static void main(String args[]) {

        //While loop
        // int i = 0;
        // while(i<100) {
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("Successfully printed numbers from 0 to 99");


        //Print 1 to 10
        // int i = 1;
        // while(i<=10){
        //     System.out.println(i + " ");
        //     i++;
        // }
        // System.out.println("Printed numbers from 1 to 10");


        //Print till number n
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number");
        // int n = sc.nextInt();
        // int i = 1;

        // while(i<=n) {
        //     System.out.print(i + " ");
        //     i++;
        // }
        // System.out.println();

        //Sum of first n natural numbers
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number");
//         int n = sc.nextInt();
//         int i = 1;
//         int sum = 0;
//         while(i<=n) {
//             sum = sum + i;
//             i++;
//         }
//         System.out.println("The sum is : " +     sum);






//FOR LOOPS
//         for(int i=0;i<=100f;i++) {
//             System.out.println("Hello World!");
//         }

//         for(int i=1;i<=4;i++){
//             System.out.println("****");
//         }

        // int i=1;
        //     while(i<=4){
        //         System.out.println("****");
        //         i++;
        //     }

        //Print Reverse of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int lastDigit;
        while(n>0) {
            lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();
        





















    } 
}








