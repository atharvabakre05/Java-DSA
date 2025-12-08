import java.util.*;

public class revision{

    public static int linearSearch(String arr[], String key){
        for(int i=0; i<arr.length; i++) {
            if(key.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }

    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        
            
        }
        return largest;
    }

    public static int binarySearch(int arr[], int key) {
        // int n = arr.length;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == key){ 
                return mid;
            }if(arr[mid]>key){
                end = mid-1;    
            }else{
                start = mid+1;
            }
         }
         return -1;
    }
    public static void reverseArray(int arr[]){
        int n = arr.length-1;
        for(int i=n; i>=0; i--){
            System.out.print(arr[i] + ",");
        }
    }

    public static void reverseOptimized(int arr[]){
        int n = arr.length-1;   
        int first = 0;
        int last = n;

        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }   
    }

    public static void pairArray(int arr[]){
        
        for(int i=0; i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void printSubArrays(int arr[]) {
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks of subjects: ");
        // System.out.println("Physics");
        // marks[0] = sc.nextInt();
        // System.out.println("Chemistry");
        // marks[1] = sc.nextInt();
        // System.out.println("Math");
        // marks[2] = sc.nextInt();
        // // int percentage = ((marks[0]+marks[1]+marks[2])/300)*100;
        // int  percentage = ((marks[0] + marks[1] + marks[2]) / 300) * 100;
        // System.out.println("The percentage of student is: "+ percentage);
        
          //Linear search
        // String arr[] = {"Samosa", "PaniPuri", "PavBhaji", "Methi", "Gobhi"};
        // int index = linearSearch(arr, "PaniPuri");    
        // if(index == -1){
        //     System.out.println("The element not found");
        // } else{
        //     System.out.println("Element was found at: "+ index);
        // }

        // int arr[] = {20, 30, 99, 9, 1000, 240, 22};
        // System.out.println("The largest number of the array is: " + largestNum(arr));


        //BINARY SEARCH

        // int arr[] = {1,8,99,101,882,1020, 9991};
        // int index = binarySearch(arr, 1020);
        // System.out.println("The index of the element in the array was found at: " + index);


        //Reverse of an Array
        // int arr[] = {1,4,66,99,1010};
        // System.out.println("The reverse of the array is: ");
        // reverseArray(arr);

        //Reverse of an Array (Optimized)
        // int arr[] = {1,2,4,6,99,100};
        // System.out.println("The reverse of the array is: ");
        // reverseOptimized(arr);
        // for(int i=0; i<=arr.length-1; i++){
        //     System.out.print(arr[i]+ ",");
        // }


        //Pair of Arrays
        // int arr[] = {2,4,6,9,10,111};
        // pairArray(arr);

        //Print all SubArrays
        int arr[] = {1,2,44,5,666,7777};
        printSubArrays(arr);

    }  
}