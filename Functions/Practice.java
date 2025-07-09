public class Practice{
    //Q1
    public static void average(int a, int b, int c) {
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }

    //Q2
    public static boolean isEven(int n) {
        if(n%2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    //Q3
  public static void palinDrome(int n) {
    int og = n;
    int rev = 0;
    while(n>0) {
        int lastDigit = n % 10;
        rev = (rev * 10) + lastDigit;
        n = n/10;
    }

    if(og == rev) {
        System.out.println("The number " + og + " is a palindrome");
    }else{
        System.out.println("The number " + og +" is not a palindrome");
    }
  }


    //Q5
    public static void sumOfDigits(int a ) {
        int myNum = a;
        int sum = 0;
        int lastDigit = 0;
        while(a>0) {
            lastDigit = a % 10;
            sum = sum + lastDigit;
            a = a/10;
        }
        System.out.println("The sum of the digits of the number " + myNum + " = " + sum);
    }





    public static void main(String [] args) {
        // average(10, 10, 10);
        // System.out.println(isEven(4));
        // palinDrome(123);
        sumOfDigits(43278);

    }
}
