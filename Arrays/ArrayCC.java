import java.util.*;
public class ArrayCC{
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("The marks of physics is: " +marks[0]);
        System.out.println("The marks of physics is: " +marks[1]);
        System.out.println("The marks of physics is: " +marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("The percentage of the all 3 subjects is " + percentage);
        System.out.println("The lenght of array is " + marks.length);

    }
}