import java.util.*;
public class revision {

    public static boolean search(int arr[][], int key){
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == key){
                    System.out.print("found at cell (" + i +"," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found!"); 
        return false;
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol) {
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            //right boundary
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+ " ");
            }

            //bottom
            for(int j=endCol-1;j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left boundary
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }


    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length;i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i!= matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static boolean stairCaseSearch(int matrix[][], int key){         //T(c) = O(m+n)
        int row = 0, col = matrix[0].length-1;

        while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            }else if(matrix[row][col]<key){
                row++;
            }else{
                col--;
            }
        }
        System.out.println("Key not found");
        return false;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int arr[][] = new int [3][3];
        // int n=3,m=3;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        //output
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // search(arr, 5);

        //Spiral Matrix
        int matrix[][] = {
            {1,2,3,4}, 
            {5,6,7,8}, 
            {10,11,12,13}, 
            {14,15,16,17}};
        // printSpiral(matrix);
        // int res = diagonalSum(matrix);
        // System.out.println(res);
        int key = 15;
        stairCaseSearch(matrix, key);


    }
}