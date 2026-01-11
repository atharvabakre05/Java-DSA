import java.util.*;
public class revision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][3];
        int n=3,m=3;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
