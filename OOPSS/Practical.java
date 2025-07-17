import java.util.Scanner;

class Addition {
    int num1, num2;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }

    int add() {
        return num1 + num2;
    }
}

public class Practical {
    public static void main(String[] args) {    
        Addition obj = new Addition();
        obj.getInput();
        int result = obj.add();
        System.out.println("The sum is: " + result);
    }
}
