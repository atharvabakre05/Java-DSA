import java.util.Scanner;

public class Matrices{

    public static boolean Search(int arr[][], int key){
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++){
                if(key == arr[i][j]){
                    System.out.print("Key found at (" + i + ","+ j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        int m = arr.length;
        int n = arr[0].length;

        for(int i=0;i<m; i++){
            for(int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }
        Search(arr, 5);
    }
}