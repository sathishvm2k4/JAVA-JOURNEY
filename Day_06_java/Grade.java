package Day_06_java;

import java.util.Scanner;

public class Grade {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    
}
/* Day 6 - if-else

 Learned:   - Decision making

Project:
  Grade checker*/