import java.util.ArrayList;

public class Tutorial3C {
    public static void main(String[] args) {
        ArrayList<String> my_array = new ArrayList<>();

        my_array.add("Python");
        my_array.add("Java");
        my_array.add("PHP");
        my_array.add("Perl");
        my_array.add("C#");

        String[] array = new String[my_array.size()];
        array = my_array.toArray(array);

        System.out.println("This is the elements in an array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
