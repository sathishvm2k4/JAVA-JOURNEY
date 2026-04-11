package Day_08_java;

import java.util.Scanner;

public class LargestNumber {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a = sc.nextInt();
         System.out.println("Enter the Second number:");
        int b = sc.nextInt();
         System.out.println("Enter the Third number:");
        int c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println("Largest number: " + a);
        } else if(b >= c) {
            System.out.println("Largest number: " + b);
        } else {
            System.out.println("Largest number: " + c);
        }
    }
}
/*here we are finding the largest of three given numbers */
