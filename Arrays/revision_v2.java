import java.util.*;
public class revision_v2 {
    //linear Search
    public static int linearSearch(String arr[], String str){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == str){
                return i;
            }
        }
        return -1;
    }
    
    //largest sum
    public static int largestSum(int arr[]){
         
    }


    //binarySearch
    //reverseArray
    //reverseOptimized
    //paiArray
    //printSubArray
    //MaxSubArraySum
    //Kadnes
    //KadanesOg
    //TrappedRainWater
    //BuyAndSellStock
    public static void main(String[] args){
        String arr[] = {"Samosa", "PaniPuri", "PavBhaji", "Methi", "Gobhi"};
        int index = linearSearch(arr, "PaniPuri");
        if(index != -1){
            System.out.println("Element found at: "+ index);
        }else{
            System.out.println("Element not found");
        }
    }
}
