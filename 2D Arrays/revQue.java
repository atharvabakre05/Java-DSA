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
    

    public static int sumofRow(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix)
    }

    public static void main(String args[]) {
        int matrix[][] = {{4,7,8}, {8,8,7}, {2,7,9}};
        System.out.print(printNumber(matrix));

    }
}
