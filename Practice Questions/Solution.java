import java.util.Scanner;
public class Solution{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int n;
        int choice;
        do{
            System.out.print("Enter the number: ");
            n = sc.nextInt();

            if(n%2==0) {
                evenSum += n;
            } else{
                oddSum += n;
            }

            System.out.println("Do you wish to continue? Press 1 for yes and 0 for no");
            choice = sc.nextInt();
        } while(choice==1);

            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
    }
}