import java.util.ArrayList;
import java.util.Scanner;

public class Tutorial4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> elements = new ArrayList<>();

        do {
            System.out.print("Enter an element to add to the list: ");
            String input = scanner.nextLine();

            elements.add(input);

            System.out.println(elements);
        }while(true);
        }
    }

