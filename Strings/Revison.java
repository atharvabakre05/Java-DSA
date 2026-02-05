import java.util.*;
public class Revison {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float shortestDistance(String str){
        float x = 0, y = 0;
        for(int i=0; i<str.length(); i++){
            float dir = str.charAt(i);
            if(dir == 'S'){
                y--;
            }else if(dir == 'N'){
                y++;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }
        }
        float X2 = x*x;
        float Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any string line: ");
        // String EnterAnyLine = sc.nextLine();
        // String LastName = "Bakre";
        // String FullName = EnterAnyLine + " " + LastName;
        // System.out.println(FullName + " is your fullname");

        // System.out.println(FullName.length());

        // String str2 = "racecar";
        // System.out.println(isPalindrome(str2));
        // String str = new String("WNEENESENNN");
        // System.out.println(shortestDistance(str));


        //Compare to function

        String str[] = {"apple", "mango", "banana"};
        String largest = str[0];
        for(int i=1; i<str.length; i++){
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        System.out.println(largest);


    }
}