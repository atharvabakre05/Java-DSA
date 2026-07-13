import java.util.*;
public class rotatedSorted {
    public static void rotateOnePlace(int arr[]){
        int temp = arr[0];
        int n = arr.length;
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

        

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        rotateOnePlace(arr);
        printArray(arr);


    }
}
