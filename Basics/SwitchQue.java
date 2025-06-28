import java.util.*;
public class SwitchQue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Choose operation: 1 for Sum, 2 for Subtraction");
        int operation = sc.nextInt();

        int sum = a + b;
        int sub = a - b;

        switch(operation) {
            case 1: System.out.println(sum);
                    break;
            case 2: System.out.println(sub);
                    break;
            default:
                    System.out.println("Invalid Operation");
        }

    }
}