import java.util.Scanner;
public class Tutorial3A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number!");
            numbers[i] = scanner.nextInt();
        }

        double average = calculateAverage(numbers);

        System.out.println("The average of the five numbers entered is " + average);

    }
    public static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int num : arr)
        {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}