import java.util.Scanner;

public class Tutorial2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        }
        else if (num < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }

    }
}