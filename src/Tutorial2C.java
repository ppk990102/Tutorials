import java.util.Scanner;
public class Tutorial2C {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a year to check if it's a leap year! ");
            int year = scanner.nextInt();

            if (LeapYear(year))
            {
                System.out.println(year + " is a leap year.");
            }
            else
            {
                System.out.println(year + " is not a leap year.");
            }

            scanner.close();
        }

        public static boolean LeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }


}
