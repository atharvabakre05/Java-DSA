import java.util.Scanner;
public class Pattern {
    public static void main (String args []) {

        //NORMAL STAR PATTERN
        // for(int line = 1; line <= 4; line++) {
        //     for(int star = 4; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // REVERTED STAR PATTERN
        int n = 4;
        for(int line = 1; line<=4; line++) {
            for(int star=1; star<=(n-line+1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}