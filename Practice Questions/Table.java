//QUESTION 2
// import java.util.Scanner;
// public class Solution{
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in);
//         int evenSum = 0;
//         int oddSum = 0;
//         int n;
//         int choice;
//         do{
//             System.out.print("Enter the number: ");
//             n = sc.nextInt();

//             if(n%2==0) {
//                 evenSum += n;
//             } else{
//                 oddSum += n;
//             }

//             System.out.println("Do you wish to continue? Press 1 for yes and 0 for no");
//             choice = sc.nextInt();
//         } while(choice==1);

//             System.out.println("Sum of even numbers: " + evenSum);
//             System.out.println("Sum of odd numbers: " + oddSum);
//     }
// }


//QUESTION 3
// import java.util.Scanner;
// public class Factorial{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);

//         int fact = 1;
//         int num;
//         System.out.println("Enter any number");
//         num = sc.nextInt();
//         for(int i = 1; i<=num; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factorial for your number is : " + fact);
//     }
// }


//QUESTION 4
// import java.util.Scanner;
// public class Table{
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int num = sc.nextInt();
//         int mul;
        
        
//         for(int i = 1; i<=10; i++) {
//             mul = num * i;
//             System.out.println(num + " x " + i + " = " + mul );
//         }
        
//     }
// }x