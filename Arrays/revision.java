import java.util.*;


public class revision{

    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++) {
            if(key == arr[i]){
                return i;
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
        int arr[] = {66,77,88,30,1,0,2};
        int index = linearSearch(arr, 1);    
        if(index == -1){
            System.out.println("The element not found");
        } else{
            System.out.println("Element was found at: "+ index);
        }
    }
  
}