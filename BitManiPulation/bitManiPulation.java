  import java.util.*;
public class bitManiPulation{
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("It's an even number");
        }else{
            System.out.println("It's an odd number");
        }
    }   
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(4);
        oddOrEven(10);
        oddOrEven(4);
        oddOrEven(7);
    }
}