import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int term = 33;
        int diff = 1;
        int sum = 0;

        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            sum += term;
            term += diff;
            diff++;
        }

        double avg = (double)sum / n;
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);
        
        sc.close();
    }
}
