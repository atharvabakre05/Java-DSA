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


    public static void main(String[] args) {

        int num[] = {4,5,6,7,0,1,2};
        int key = 4;
        int result = search(num, key);
        System.out.print("The Element found at index " + '{' +  result + '}' );
    }
    
}
