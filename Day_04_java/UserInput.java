import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + " Brother Welcome to Java Journey");
    }
}
/*  Day 4 - User Input
    Learned:
    Taking input using Scanner
    Project:
    User input program*/