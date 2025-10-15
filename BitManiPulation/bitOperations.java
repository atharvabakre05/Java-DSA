import java.util.*;
public class bitOperations {
    public static int getBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public static int setBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static void main(String[] args){
        // System.out.println(getBit(10, 2));
        System.out.println(setBit(10, 2));
    }
}
