import java.util.Scanner;

public class Tutorial6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("Strong password!");
        }
        else {
            System.out.println("Weak password!");
            System.out.println("The password must contain at least 8 characters!");
            System.out.println("The password must contain includes uppercase,lowercase,numbers and special characters!");
        }

        scanner.close();
    }
    public static boolean isStrongPassword(String password) {
        return password.length() >= 8 && containsUppercase(password) && containsLowercase(password)
                && containsNumber(password) && containsSpecialCharacter(password);
    }

    //UpperCase
    public static boolean containsUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    //LowerCase
    public static boolean containsLowercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    //Numbers
    public static boolean containsNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    //SpecialCharacters
    public static boolean containsSpecialCharacter(String password) {
        String specialCharacters = "!@#$%^&*()-+{}<>?";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}

