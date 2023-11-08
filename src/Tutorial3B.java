import java.util.Arrays;
import java.util.Scanner;

public class Tutorial3B {
    public static void main(String[] args) {
        int[] numbers = {25,14,56,15,36};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        System.out.println("Enter an element to remove from the original array!");
        Scanner scanner = new Scanner(System.in);
        int elementToRemove = scanner.nextInt();

        numbers = removeElement(numbers, elementToRemove);

        System.out.println("New Array after removing element " + elementToRemove + ": " + Arrays.toString(numbers));
    }
    public static int[] removeElement(int[] array, int element) {
        int removeNum = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                removeNum = i;
                break;
            }
        }

        if (removeNum != -1) {
            int[] newArray = new int[array.length - 1];
            int newIndex = 0;

            for (int i = 0; i < array.length; i++) {
                if (i != removeNum) {
                    newArray[newIndex] = array[i];
                    newIndex++;
                }
            }
            return newArray;
        } else {
            return array;
        }
    }
}

