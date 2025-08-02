import java.util.*;
public class Assignment {


    //Q1
    public static boolean repeatValues(int num[]) {
        for(int i=0; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
                if(num[i] == num[j]){
                    return true;
                }

            }
        }
        return false;


    }

    //Q2
    public static int search(int num[],int key) {

        int start = 0;
        int end = num.length -1;
        
        while(start<=end) {
            int mid = start + (end-start)/2;

            if(num[mid] == key) {
                return mid;
            }

            if(num[start]<= num[mid]){         //left side array sorted

                if(key>=num[start] && key<num[mid]){
                    end = mid-1;
                } 
                else{
                    start = mid + 1;    //Target is in the right half
                }
            }
            
            else{

                if(key<=num[end] && key>num[mid]) {
                    start = mid+1;
                } 
                else{
                    end = mid - 1;      //Target is in the left half
                }
            } 

        }
        return -1;
    }


    //Q3
    public static int stocks(int price[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length; i++) {

            if(price[i]<buyPrice) {
                buyPrice = price[i];
            }
            else{
                int profit = price[i] - buyPrice;
             
                maxProfit = Math.max(profit, maxProfit);

            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {


        //Q1 BINARY SEARCH ROTATED ARRAY AT INDEX PIVOT
        // int num[] = {4,5,6,7,0,1,2};
        // int key = 4;
        // int result = search(num, key);
        // System.out.print("The Element found at index " + '{' +  result + '}' );



        //Q2 Maximum price
        int price[] = {7,1,5,3,6,4};
        System.out.println("The maximum profit of all the prices shared in all days are: " + stocks(price));



    }
    
}
