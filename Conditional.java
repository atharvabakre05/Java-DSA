import java.util.*;
public class Conditional {
    public static void main(String args[]) {
    //     int age = 20;
    //     if(age>= 18) {
    //         System.out.println("Eligible for voting");
    //     }
    //     else {
    //         System.out.println("Not eligible");
    // //     }

    //   int A = 75;
    //     int B = 80;
    //     if(A>B) {
    //         System.out.println("A is the largest");
    //     }
    //     else{
    //         System.out.println("B is the largest");
    //         }
        
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // if(number%2==0) {
        //     System.out.println("The entered number is even");
        // }
        // else{
        //     System.out .println("The entered number is odd");
        // }


    //     Scanner sc = new Scanner(System.in);
    //     int income = sc.nextInt();
    //     int tax;
    //     if(income<500000){
    //         tax = 0;
    //     }
    //     else if(income>=500000 && income<1000000) 

    // //Ternary Operators
    // int number = 7;
    // String type = ((number%2) == 0) ?"even" : "odd";
    // System.out.println(type);

    //Check if Student is pass or Fail 

    // int marks = 57;
    // if(marks>=33 && marks <= 100) {
    //     System.out.println("Pass");
    // }
    // else{
    //     System.out.println("Fail");
    // }


    //Switch cases 
    // int number = 2;
    // switch(number) {
    //     case 1: System.out.println("Samosa");
    //             break;

    //     case 2: System.out.println("Gulabjam");
    //             break;
                
    //     case 3: System.out.println("Rolls");
    //             break;

    //     default: System.out.println("We wake up");

    // }

        // Calculator using switch
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1: ");
        // int A = sc.nextInt();
        // System.out.println("Enter number 2: ");
        // int B = sc.nextInt();

        // System.out.println("Enter operator: ");

        // char operator = sc.next().charAt(0);

        // switch(operator) {
        //     case '+': System.out.println(A+B);
        //                 break;
        //     case '-': System.out.println(A-B);
        //                 break;
        //     case '*': System.out.println(A*B);
        //                 break;
        //     case '%': System.out.println(A%B);
        //                 break;
        //     case '/': System.out.println(A/B);
        //                 break;

        //     default: System.out.println("Wrong operator");
        // }
        //Q1 
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter any number");
            // int A = sc.nextInt();
            // if(A>0){
            //     System.out.println("It's a positive number");
            // }
            // else if(A == 0) {
            //     System.out.println("It's neutral");
            // }
            // else{
            //     System.out.println("It's a negative number");
            // }

        //Q2
        // double temp = 103.5;
        // if(temp>100){
        //     System.out.println("You have a fever");
        // }
        // else{
        //     System.out.println("No fever");
        // }

        //Q3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number from 1 to 7");
        // int A = sc.nextInt();

    
        // switch(A){
        //     case 1: System.out.println("Monday");
        //             break;
        //     case 2: System.out.println("Tuesday");
        //             break;
        //     case 3: System.out.println("Wednesday");
        //             break;
        //     case 4: System.out.println("Thursday");
        //             break;
        //     case 5: System.out.println("Friday");
        //             break;
        //     case 6: System.out.println("Saturday");
        //             break;
        //     case 7: System.out.println("Sunday");
        //             break;

        //     default: System.out.println("Not a week day");
        // }

        //Q4
        // int a = 63, b = 35;
        // boolean x = (a>b) ? true : false;
        // System.out.println(x);
        // int y = (a>b) ? a : b;
        // System.out.println(y);

        //Q5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int A = sc.nextInt();
        if(A%4 == 0) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}