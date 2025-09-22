import java.util.*;
public class Basics{


    public static void printLetters(String str){
    for(int i=0; i<str.length(); i++){
        System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
    }

    public static String getSubString(String str, int si, int ei){
        String subString = "";
        for(int i=si; i<ei; i++){
            subString+=str.charAt(i);
        }
        return subString;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String name, sentence;
        // name = sc.next();
        // System.out.println("Your name is: " + name);

        //To find the length of the String!
        // sentence = sc.nextLine();
        // System.out.println(sentence.length());

        
        // //Concatination and charAt 
        // String firstName = ("Atharva");
        // String lastName = ("Bakre");
        // String fullName = firstName + " " + lastName;
        // // System.out.println("My full name is: " + fullName);
        // // System.out.println(fullName.charAt(2));
        // printLetters(fullName);

        //SUBSTRING 
        String str = "HelloWorld";
        System.out.println(getSubString(str, 0, 4));

        
    }
}