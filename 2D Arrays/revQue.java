public class revQue {


    //Q1
    public static int printNumber(int matrix[][]){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }
    
    //Q2
    public static int sumofRow(int matrix[][]){
        int sum = 0;
        for(int i=1; i<matrix.length-1; i++){
            for(int j=0; j<matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    //Q3
    public static void transPose(int matrix[][]){
        for(int i=0; i<matrix[0].length; i++){  //columns
            for(int j=0; j<matrix.length; j++){ //rows
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // int matrix[][] = {{4,7,8}, {8,8,7}, {2,7,9}};
        int arr[][] = {{1,2,3}, {4,5,6}};

        // System.out.print(printNumber(matrix));
        // System.out.print(sumofRow(matrix));
        transPose(arr);
    }
}
