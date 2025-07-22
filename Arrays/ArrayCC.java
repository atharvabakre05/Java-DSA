import java.util.*;
public class ArrayCC{

    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }


    public static int linearSearch(String number[], String key) {
        for(int i=0; i<number.length; i++) {
            if(number[i]== key) {
                return i;
            } 
        }
        return -1;
    }

    public static int largestNum(int num[]) {
        int largest = Integer.MIN_VALUE; // =infinity
        for(int i=0; i<num.length;i++){
            if(largest<num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        // int marks[] = new int[50];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("The marks of physics is: " +marks[0]);
        // System.out.println("The marks of physics is: " +marks[1]);
        // System.out.println("The marks of physics is: " +marks[2]);

        // int percentage = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("The percentage of the all 3 subjects is " + percentage);
        // System.out.println("The lenght of array is " + marks.length);


        //ARRAYS AS FUNCTION ARGUMENTS 

        // int marks[] = {93, 95, 91, 99, 94};
        // int nonChangable = 5;

        // update(marks, nonChangable);


        // for(int i=0; i<marks.length; i++) {
        //     System.out.print( " "+ marks[i]);
        // }
        // System.out.println();
        // System.out.println(nonChangable);


        //LINEAR SEARCH

        // int number[] = {10, 20,45, 100, 33, 64};
        // key = 33;
        // int index = linearSearch(number, key);
        // if(index == -1) {
        //     System.out.print("NOT FOUND");
        // }else{
        //     System.out.println("Item found at: " + index);
        // }

        // String food[] = {"dosa", "idli", "sambaar", "chutney","chutney","chutney"};
        // String key;
        // key = "sambaar";
        // int index = linearSearch(food, key);
        // if(index == -1) {
        //     System.out.println("NOT FOUND");
        // } else{
        //     System.out.println("The food item is: " + index);
        // }

        //LARGEST NUMBER IN A GIVEN ARRAY

        int num[] = {1,55,67,99, 101, 1, 01, 99};
        System.out.println("The largest number of the array is: " + largestNum(num));



















    }
}