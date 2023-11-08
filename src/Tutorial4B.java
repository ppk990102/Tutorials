import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tutorial4B {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Green");
        colours.add("Black");
        colours.add("White");
        colours.add("Pink");

        System.out.println("ArrayList before swapping:");
        System.out.println(colours);

        System.out.print("Enter the position of a colour to swap: ");
        Scanner scanner1 = new Scanner(System.in);
        int p1 = Integer.parseInt(scanner1.nextLine());

        System.out.print("Enter the position of a colour to swap with: ");
        Scanner scanner2 = new Scanner(System.in);
        int p2 = Integer.parseInt(scanner2.nextLine());

        if (p1 < colours.size() && p2 < colours.size() && p1>= 0 && p2 >= 0)
        {
            Collections.swap(colours, p1, p2);

            System.out.println("ArrayList after swapping the colours of " + p1 + " and " + p2 + ":");
            System.out.println(colours);
        }
        else
        {
            System.out.println("Error! Put a valid position");
        }
    }
}

