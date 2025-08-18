import java.util.*;
public class Sorts{
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            boolean isSwapped = false;

            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                if(turn==0){
                System.out.println("The array is already sorted");
                break;
                }
               
            }

        }

    }

    public static void displayArray(int arr[]) {
        System.out.println("The Sorted array is");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,22,34,57,90};
        bubbleSort(arr);
        displayArray(arr);
    }

}
    