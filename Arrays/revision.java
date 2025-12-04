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

        int arr[] = {1,8,99,101,882,1020, 9991};
        int index = binarySearch(arr, 1020);
        System.out.println("The index of the element in the array was found at: " + index);
    }  
}