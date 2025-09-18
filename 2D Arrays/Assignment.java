import java.util.*;
public class Assignment {
    //Q1
    // public static void total7(int nums[][]){
    //     int count = 0;
    //     for(int i=0; i<nums.length; i++) {
    //         for(int j=0; j<nums[0].length; j++){
    //             if(nums[i][j] == 7){
    //                 count = count +1;
    //             }
    //         }
    //     }
    //     System.out.println("The total 7 in the whole matrix are: " + count);
    // }

    //Q2
    // public static void secondRowSum(int num[][]){
    //     int sum=0;
    //     int row=1;
    //     for(int j=0; j<num[row].length; j++){
    //         sum+=num[row][j];
    //     }
    //     System.out.println("The sum of the second row of the array is: "+ sum); 
    // }

    //Q3

    public static void transposeMatrix(int num[][]){
        for(int i=0; i<num[0].length; i++){
            for(int j=0; j<num.length; j++){
                System.out.print(num[j][i]);
            }
            System.out.println();
        }
    }


    
    public static void main(String[] args){
        int num[][] = {{4,7,8}, {8,8,7}};
        // total7(nums); //Q1
        // secondRowSum(num); //Q2
        transposeMatrix(num);
    }
}
