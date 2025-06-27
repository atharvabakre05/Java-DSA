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
//         int n = 4;
//         for(int line = 1; line<=4; line++) {
//             for(int star=1; star<=(n-line+1); star++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

         //HALF PYRAMID PATTERN
        //  int line;
        //  int num;
        //  for(line=1;line<=4;line++) {
        //     for(num=1;num<=line;num++) {
        //         System.out.print(num);
        //     }
        //     System.out.println();
        //  }

        //CHARACTER PATTERN

        int n = 4;
        char ch = 'A';

        for(int line = 1; line<=n; line++) {
            
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }













    }
}



