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

//FLOYD'S Triangle
    public static void floyd_triangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

//0-1 Triangle 
    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if( (i+j) % 2 == 0) {
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }

//Butterfly pattern
//FIRST HALF
    public static void butterfly(int n) {
        //1st half
        for(int i=1;i<=n;i++) {
            //Printing Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //Printing Spaces
            for(int j=1; j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            //Printing Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--) {
            //Printing Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //Printing Spaces
            for(int j=1; j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            //Printing Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            
    }

    public static void parallelogram(int n) {

        for(int i=1; i<=n; i++) {
            //Printing space 
            for(int j=1;j<=(n-i); j++) {
                System.out.print(" ");
            }
            //Printing stars
            for(int j=1;j<=4;j++) {
                System.out.print("*");
            }
            //Printing space
            for(int j=1;j<=(n-(n-i)-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces 
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            //Star and space
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }   
            System.out.println();
        }
    }


    public static void diamond(int n) {
        //1st half
        for(int i=1; i<=n;i++) {
            //Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++) {
                System.out.print("*");
                
                
            }
            System.out.println();
        
    }
    //2nd Half
      for(int i=n; i>=1;i--) {
            //Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
    }
}


    public static void main(String [] args) {
        // hollow_rectangle(4, 5);
        // inverted_half_pyramid(5);
        // inverted_half_pyramid_numbers(5);
        // floyd_triangle(5);
        // zero_one_triangle(5);
        // butterfly(10);
        // parallelogram(4);
        // solid_rhombus(7);
        // hollow_rhombus(5);

        diamond(4);



    }
}