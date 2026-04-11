package Day_08_java;

import java.util.Scanner;

public class LargestNumber {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if(b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }
}
/*here we are finding the largest of three given numbers */
