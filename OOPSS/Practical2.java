//Name: Atharva Bakre Roll number: 33
import java.util.Scanner;

class Shape {
    int dim1, dim2;

    void printArea() {
       
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        dim1 = length;
        dim2 = breadth;
    }

    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class
class Triangle extends Shape {
    Triangle(int base, int height) {
        dim1 = base;
        dim2 = height;
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class
class Circle extends Shape {
    Circle(int radius) {
        dim1 = radius;
    }

    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class Practical2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("===== Area Calculator =====");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1-3): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length and breadth of rectangle: ");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                Rectangle rect = new Rectangle(length, breadth);
                rect.printArea();
                break;

            case 2:
                System.out.print("Enter base and height of triangle: ");
                int base = sc.nextInt();
                int height = sc.nextInt();
                Triangle tri = new Triangle(base, height);
                tri.printArea();
                break;

            case 3:
                System.out.print("Enter radius of circle: ");
                int radius = sc.nextInt();
                Circle circ = new Circle(radius);
                circ.printArea();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}