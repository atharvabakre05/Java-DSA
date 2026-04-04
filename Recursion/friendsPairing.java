import java.util.*;
public class friendsPairing {
        public static int friendPairing(int n){
            if(n == 0 || n == 1){
                return 1;
            }
            //Single
            int fnm1 =  friendPairing(n-1);

            //Pair
            int fnm2 = friendPairing(n-2);
            int pairWays = (n-1) * fnm2;

            //totalways
            int totalWays = fnm1 + pairWays;
            return totalWays;
        }

        public static void main(String[] args){
            System.out.println(friendPairing(3));
        }
}
