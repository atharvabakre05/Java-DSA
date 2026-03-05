public class tiling {

    public static int tilingProblem(int n){
        if(n ==0 || n==1){
            return 1;
        }

        //For vertical 
        int fnm1 = tilingProblem(n-1);
        //For horizontal
        int fnm2 = tilingProblem(n-2);

        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args){
        System.out.println(tilingProblem(3));
    }
}
