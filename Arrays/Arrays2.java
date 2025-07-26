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


    public static void prifixSubarrays(int num[]) {
        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        for(int i=1; i<num.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        System.out.print("Prefix sum Array: ");
        for(int i=0; i<prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        //SUM OF SYBARRAY [BRUTE FORCE]
        // int num[] = {2, -4, 6, 8, -10, 7};
        // printSumofSubArrays(num);


        //BREAK //25-07-25


        //SUM OF ARRAY USING PREFIX ARRAY {EFFICIENT}
        int num[] = {2, 5, 7, 10, 9};
        prifixSubarrays(num);


    }
}