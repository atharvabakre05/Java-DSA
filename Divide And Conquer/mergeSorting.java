//T(c) = O(nlogn);
//S(c) = O(n);

import java.util.*;
    public class mergeSorting{
        public static void printArray(int arr[]){
            for(int i=0; i<arr.length-1; i++){
                System.out.print(arr[i] + " ");
            }
        }
        public static void mergeSort(int arr[], int si, int ei){
            //Base
            if(si>=ei){
                return;
            }
            int mid = si + (ei-si)/2;
            //Left part Sort
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

            //For leftover elements of 1st sorted part
            while(i<=mid){
                temp[k++] = arr[i++];
            }
            //For leftover elements of 2nd sorted part
            while(j<=ei){
                temp[k++] = arr[j++];
            }


            //Copy temp elements to orignal arr
            for(k=0, i=si; k<temp.length; k++, i++){
                arr[i] = temp[k];
            }
        }
        public static void main(String[] args){
            int arr[] = {2,88,99,7,21,10};
            mergeSort(arr, 0, arr.length-1);
            printArray(arr);

        }
    }