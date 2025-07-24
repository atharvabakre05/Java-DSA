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
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i=0; i<num.length;i++){
            if(largest<num[i]) {
                largest = num[i];
            }
        }

        for(int i=0; i<num.length;i++){
            if(smallest>num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }


    public static int binarySearch(int num[], int key) {
        int start=0, end=num.length -1;
        int mid;
        while(start<=end) {
            mid = (start+end)/2;
            if(num[mid] == key) {
                return mid;
            } 
            if(num[mid]>key) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }


    public static void reverse(int num[]) {
        int start = 0, end = num.length-1;
        while(start<end) {
            int temp = start; 
            start = end; 
            end = start;

            end--;
            start++;
        }
    }

    public static void pairs(int num[]){
        for(int i=0; i<num.length; i++) {
            int curr = num[i];

            for(int j=i+1; j<num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ") " );
            }
            System.out.println();
        }
    }

    public static void printSubArrays(int num[]) {
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<num.length; i++) {
            int sum=0;
            int start=i;

            for(int j=i; j<num.length;j++) {
                int end=j;
                for(int k=start; k<=end; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                if(sum>max) {
                    max = sum;
                } 
                if(sum<min) {
                    min = sum;
                }
                ts++;
                System.out.println();
            }
            System.out.println("Sum: "+ sum);
            System.out.println();
        }
        System.out.println("The total number of subarrays are " + ts);
        System.out.println("The maximum sum of an array here is " + max);
        System.out.println("The minimum sum of an array here is " + min);

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

        // int num[] = {1,55,67,99, 101, 1, 01, 99};
        // System.out.println("The largest number of the array is: " + largestNum(num));
        // System.out.println("The lowest number of the array is: " + lowestNum(num));


        // //BINARY SEARCH
        // int num[] = {1,24,66,79,101,221,391};
        // int key = 66;
        // System.out.println("The key value in the sorted array is: " + binarySearch(num, key));





        //REVERSE OF ARRAY USING SWAP
        // int num[] = {3, 45, 77, 89, 100, 101};

        // for(int i=0; i<num.length; i++) {
        //     System.out.print(num[i] + " ");
        // }
        

        //PAIRS IN ARRAY

        // int num[] = {2, 4, 20, 33, 48, 54, 101};
        // pairs(num);

        //PRINT SUB-ARRAYS and sub arrays Sum
        int num[] = {1,2,3};
        printSubArrays(num);
    















 






    }
}