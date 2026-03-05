import java.util.*;
public class RecursionBasics{
    
    //Problem 1
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    //Problem 2
    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }

    //Problem 3
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }


    //Problem 4
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int Sm1 = calcSum(n-1);
        int Sn = n+Sm1;
        return Sn;
    }


    //Problem 5
    public static int fib(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //Problem 6
    public static boolean isSorted(int arr[], int n){
        if(n == arr.length-1){
            return true;
        }
        if(arr[n]>arr[n+1]){
            return false;
        }
        return isSorted(arr, n+1);
    }

    //Problem 7
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }

    //Problem 8
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    //Problem 9 //O(n)
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

    //Problem 10 (Optimized x^n)    //O(logn)
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    




    public static void main(String[] args){
        // int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(5));
        // System.out.println("The total Sum of first 10 natural numbers is: "+ calcSum(n));
        // System.out.println(fib(10));
        // System.out.println(fib(11));
        // System.out.println(fib(12));

        // int arr[] = {1,2,10,4,5,7,4};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurence(arr, 4, 0));
        // System.out.println(lastOccurence(arr, 4, 0));
        // System.out.println(power(2, 10));

        System.out.println(optimizedPower(2, 5));

    }   

}