import java.util.*;
public class tiling{
    public static int tilingProblem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        //vertical choice 
        int fm1 = tilingProblem(n-1);

        //horizontal choice 
        int fm2 = tilingProblem(n-2);

        int totWays = fm1 + fm2;
        return totWays;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem(3));   
    }
}