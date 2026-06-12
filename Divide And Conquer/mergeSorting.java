import java.util.*;
public class mergeSorting{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //Left side leftover elements
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //Right side leftover elements
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //Copy these temp elements back to og array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args){
        int arr[] = {2, 88, 99, 7, 21, 10};
        mergeSort(arr,0,5);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}