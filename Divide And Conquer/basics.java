import java.util.*;
public class basics{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
    public static void merge(int arr[],int si, int mid, int ei){
        int temp=
    }

    public static void main(String[] args){
        int arr[] = {6,3,4,5,2,9};
        mergeSort(arr, 0, arr.length-1);

    }

}