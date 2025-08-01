import java.util.*;
public class Arrays2 {

    public static void printSumofSubArrays(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j=i;j<num.length;j++) {
                int currSum = 0;
                int end=j;
                for(int k=start; k<=end;k++) {
                    currSum += num[k];
                }
              
              if(maxSum<currSum) {
                    maxSum = currSum;
                }
                System.out.print("=> Sum: " + currSum);
                System.out.println();
            }
        }
        System.out.println("Max sum is " + maxSum);
    }

    //PREFIX SUB ARRAY
    public static void prefixSubarrays(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MAX_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        for(int i=1; i<num.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }
        System.out.print("The prefix SubArray is: " + Arrays.toString(prefix));
        System.out.println();

        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j=i; j<num.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end]: prefix[end] - prefix[start - 1]; 

                for(int k=start; k<=end; k++) {
                    System.out.print(num[k]);
                    if(k!=end) System.out.print(",");
                }
                System.out.println(" Sum =>"+ currSum);
                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("\nThe maximum sum of the subarray is: " + maxSum);

    }

    //KADANE's Algorithm

    public static void kadane(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        boolean allNegative = true;
        int maxElement = num[0];

        for(int i=0; i<num.length; i++) {
            if(num[i]>=0) {
                allNegative = false;
            }

            if(num[i]>maxElement) {
                maxElement = num[i];
            }
            currSum += num[i];
            if(currSum<0){
                currSum = 0;
            }

            if(currSum>maxSum) {
                maxSum = currSum;
            }
            if(allNegative) {
                maxSum = maxElement;
            }
        }
        System.out.println("The maximum sum of SubArray is " + maxSum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        //SUM OF SYBARRAY [BRUTE FORCE]
        // int num[] = {2, -4, 6, 8, -10, 7};
        // printSumofSubArrays(num);


        //BREAK //25-07-25

        
        //SUM OF ARRAY USING PREFIX ARRAY {EFFICIENT}
        // int num[] = {2, 5, -7, 10, 9};
        // prefixSubarrays(num);

        //KADADNE'S ALgorithm
        int num [] = {-11, -3, -4, -2, -10, -9, -2};
        kadane(num);
    }
}