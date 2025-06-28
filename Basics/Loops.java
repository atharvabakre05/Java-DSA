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
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number");
        // int n = sc.nextInt();
        // int lastDigit;
        // while(n>0) {
        //     lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n = n/10;
        // }
        // System.out.println();
        
        //Reverse the orignal number and save 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number");
        // int n = sc.nextInt();
        // int lastDigit;
        // int rev = 0;
        // while(n>0) {
        //     lastDigit = n%10;
        //     rev = (rev*10) + lastDigit;
        //     n = n/10;
        // }
        // System.out.println(rev);

        //do while loop
        // int counter = 1;
        // do{
        //     System.out.println("Hello World!");
        //     counter++;  
        // } while(counter<=10);

        //break statement
        // for(int i=1;i<=5;i++) {
        //     if(i==3){

        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        //
        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter any number : ");
        //     int n = sc.nextInt();

        //     if(n%10 == 0) {
        //         break   ;
        //     }
        //     System.out.println(n);
        // } while(true);
        // System.out.println("You entered a multiple of 10");


        //CONTINUE
            // for(int i=0;i<=10;i++){
                
            //     if(i==3){
            //         continue;
            //     }

            // System.out.println(i);
            // }

        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter any number : ");
        //     int n = sc.nextInt();

        //         if(n%10 ==0) {
        //             continue;
        //     }

        //     System.out.println("number was : " + n);
        // } while(true);


        //CHECK A NUMBER IS PRIME OR NOT
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) {
                    isPrime = false;
                    break; // once we know it's not prime, we exit early
                }
            }

            if(isPrime == true) {
                System.out.println("It's a prime number");
            } else {
                System.out.println("It's not a prime number");
            }
        }

        
















    } 
}








