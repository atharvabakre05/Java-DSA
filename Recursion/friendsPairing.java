import java.util.*;
public class friendsPairing {
        public static int friendPairing(int n){
            if(n == 0 || n == 1){
                return 1;
            }
            return friendPairing(n-1) + (n-1) * friendPairing(n-2);
        }

        
        public static void main(String[] args){
            System.out.println(friendPairing(3));
        }
}
