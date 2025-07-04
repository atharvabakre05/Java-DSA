import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String input = sc.next(); //Stores a single line only
        // System.out.println(input);

        // String name = sc.nextLine(); //Stores multiple words
        // System.out.println(name);

        // int number = sc.nextInt(); 
        // System.out.println(number);

        //  float price = sc.nextFloat();
        //  System.out.println(price);
 
        // Boolean bl = sc.nextBoolean();
        // System.out.println(bl);

        // Short sh = sc.nextShort();
        // System.out.println(sh);


        //Sum of a & b using taking an input
        // Scanner sc = new Scanner(System.in);
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float sum = a + b;
        // System.out.println(sum);


        //Product of a & b
        // Scanner sc = new Scanner(System.in);
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float product = a * b;
        // System.out.println(product);


        //Area of a circle 
        // Scanner sc = new Scanner(System.in);
        // float r = sc.nextFloat();
        // float area = 3.14f*r*r;
        // System.out.println(area);

        //Type/Implicit/Widening Conversion 
        // Scanner sc = new Scanner(System.in);
        // float a = sc.nextInt();
        // System.out.println(a);


        //Type Casting
        // Scanner sc = new Scanner(System.in);
        // float a = 20.15f;
        // int b = (int)a;
        // System.out.println(b);

        // char ch = 'a';
        // int number = ch;
        // System.out.println(number);

        // char ch2 = 'd';
        // int num2 = ch2;
        // System.out.println(num2);


        //Practice Questions
         //Q1
        //  Scanner sc = new Scanner(System.in);
        //  float a = sc.nextFloat();
        //  float b = sc.nextFloat();
        //  float c = sc.nextFloat();

        //  double avg = (a+b+c)/3;
        //  System.out.println(avg);


        //Q2
        // Scanner sc = new Scanner(System.in);
        // int s = sc.nextInt();
        // float area =  s*s;
        // System.out.println(area);

        //Q3
        Scanner sc = new Scanner(System.in);

        //Taking inputs
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        //Calculating the total and GST
        float total = pencil + pen + eraser;
        System.out.println("This is your total bill "+ total);
        float GST = total * 0.18f;
        System.out.println("GST added to this is " + GST);
        float finalBill = total + GST;

        System.out.println("This is the finalBill " +finalBill);
        sc.close();


        //Q5
        int $ = 24; //This will not give an error because NamesofvariablesarecalledidentifiersinJava.Identifierrulesays,identifierscanstartwithany alphabet or underscore (“_”) or dollar (“$”).According to the rule the given variable name is a valid identifier
    }
} 