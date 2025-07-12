import java.util.*;
public class pattern{

    //HOLLOW RECTANGLE
    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop
        for(int i=1;i<=totRows;i++) {
            //inner loop
            for(int j=1;j<=totCols;j++) {
                if(i==1|| i == totRows || j == 1|| j == totCols) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

//INVERTED AND ROTATED HALF PYRAMID 

    public static void inverted_half_pyramid(int n) {
        for(int i=0; i<=n; i++) {
            //print spaces
            for(int j=0;j<=n-i;j++) {
                System.out.print(" ");
            }
            //print stars
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }


//INVERTED HALF-PYRAMID with Numbers
    public static void inverted_half_pyramid_numbers(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        // hollow_rectangle(4, 5);
        // inverted_half_pyramid(5);
        inverted_half_pyramid_numbers(5);






    }
}