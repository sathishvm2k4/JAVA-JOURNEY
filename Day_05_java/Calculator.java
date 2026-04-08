import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
    }
}
/*# Day 5 - Operators

Learned:
- Arithmetic operators

Project:
Basic calculator */