import java.util.*;
public class Revison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string line: ");
        String EnterAnyLine = sc.nextLine();
        String LastName = "Bakre";
        String FullName = EnterAnyLine + " " + LastName;
        System.out.println(FullName + " is your fullname");
    }
}
