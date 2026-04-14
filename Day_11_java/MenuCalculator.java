package Day_11_java;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1.Add 2.Subtract 3.Exit");
            choice = sc.nextInt();

            if(choice == 3) break;

            int a = sc.nextInt();
            int b = sc.nextInt();

            switch(choice) {
                case 1: System.out.println(a + b); break;
                case 2: System.out.println(a - b); break;
            }

        } while(true);
    }
}
