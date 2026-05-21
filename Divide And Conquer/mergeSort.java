//T(c) = O(nlogn);
//S(c) = O(n);

import java.util.*;
    public class mergeSort{
        public static void printArray(int arr[]){
            for(int i=0; i<arr.length-1; i++){
                System.out.print(arr[i] + ",");
            }
        }
        public static void mergeSort(int arr[], int si, int ei){
            //Base
            if(si<=ei){
                return;
            }
            int mid = si + (ei-si)/2;
            //Left part Sort
            mergeSort(arr, si, mid);
            mergeSort(arr, mid+1, ei);
            merge(arr, si, mid, ei);
        }

        public static void merge(int arr[], int si, int mid, int ei){
            int temp[] = new int 

        }


        public static void main(String[] args){
            int arr[] = {2,88,99,7,21,10};


        }
    }