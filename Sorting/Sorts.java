    import java.util.*;
    public class Sorts{
        // public static void bubbleSort(int arr[]){
        //     for(int turn=0; turn<arr.length-1; turn++){
        //         boolean isSwapped = false;

        //         for(int j=0; j<arr.length-1-turn; j++){
        //             if(arr[j]>arr[j+1]){
        //                 int temp = arr[j];
        //                 arr[j] = arr[j+1];
        //                 arr[j+1] = temp;
        //                 isSwapped = true;
        //             }
        //         }
        //         if(!isSwapped){
        //             if(turn==0){
        //             System.out.println("The array is already sorted");
        //             break;
        //             }
                
        //         }

        // //     }

        // public static void selectionSort(int arr[]){
        //     for(int i=0; i<arr.length-1; i++) {
        //         int minPos = i;
        //         for(int j=i+1; j<arr.length-1; j++) {
        //             if(arr[j]<arr[minPos]){
        //                 minPos = j;
        //             }
        //         }
        //         //swap
        //         int temp = arr[minPos];
        //         arr[minPos] = arr[i];
        //         arr[i] = temp;
        //     }
        // }


        // public static void insertionSort(int arr[]) {
        //     for(int i=1; i<arr.length; i++) {
        //         int j=i-1; 
        //         while(arr[i]>arr[j] && j>=0){
        //             arr[j+1] = arr[j];
        //             j--;
        //         }
        //         arr[j+1] = arr[i];
        //     }
        // }

        // public static void displayArray(int arr[]){
        //     for(int i=0; i<arr.length; i++){
        //         System.out.print(arr[i] + " ");
        //     }
        // }

        public static void palindrome(int a){
            int orignal = a;
            int reversed = 0;
            while(a>0){
                int digit = a%10;
                reversed = reversed*10 + digit;
                a = a/10;
            }
            if(orignal==reversed) {
                System.out.println("It's a palindrome number: " + reversed);
            }else{
                System.out.println("It's not a palindrome number cause the reveresd number is not the same as input\nReversed number: "+ reversed + "\nOrignal number: " + orignal);
            }
        }



        public static void main(String args[]) {
            // int arr[] = {1,99,2,33,100};
            // insertionSort(arr);
            // displayArray(arr);
            palindrome(123);






        }


        


    }