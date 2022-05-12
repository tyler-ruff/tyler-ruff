import java.util.Random;
import java.util.Scanner;
/*
    * Simple Guessing Game
    * User is prompted to guess a number
    * between one and ten. User then can
    * restart or quit the game loop from there.
 */
public class Main {
    public static void main(String args[]) {
        boolean gameFlag = true;
        while (gameFlag) {
            System.out.println("Welcome, guess a number between one and ten.");
            Random r = new Random();
            Scanner in = new Scanner(System.in);
            int secret = (r.nextInt(10)) + 1;
            int answer = in.nextInt();
            System.out.printf("Dealer's Number: %S", secret);
            if (answer < 11 && answer >= 1) {
                // number qualifies, test against secret
                if (answer >= secret) {
                    // player wins
                    System.out.println("You win!! Try your luck again?");
                } else if (answer == secret) {
                    // draw
                    System.out.println("Game draw. Please play again...");
                } else {
                    // player looses
                    System.out.println("You loose. Please play again...");
                }
            }
            System.out.println("Where to go next? [N]ew game [Q]uit");
            String answerGame = in.next();
            switch(answerGame.toUpperCase()) {
                case "N":
                    continue;
                case "Q":
                    gameFlag = false;
                    break;
            }
        }
    }
}
