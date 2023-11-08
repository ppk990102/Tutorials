import java.util.Scanner;
import java.util.Random;

public class Tutorial5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors.");
        int user = scanner.nextInt();

        int computer = random.nextInt(3);
        String userPlayed ="";
        String computerPlayed ="";

        if (user==0){
             userPlayed = "Rock";
        }
        else if (user==1){
             userPlayed = "Paper";
        }
        else{
             userPlayed ="Scissors";
        }

        if (computer==0){
             computerPlayed = "Rock";
        }
        else if (computer==1){
             computerPlayed = "Paper";
        }
        else{
             computerPlayed ="Scissors";
        }

        System.out.println("Your choice: " + userPlayed);
        System.out.println("Computer's choice: " + computerPlayed);

        if (user == computer)
        {
            System.out.println("It's a tie!");
        }
        else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1))
        {
            System.out.println("You win!");
        }
        else
        {
            System.out.println("You lose!");
        }
    }

}
