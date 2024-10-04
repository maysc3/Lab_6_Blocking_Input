import java.util.Random;
import java.util.Scanner;
public class HighorLow
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        String trash = "";
        String continueYN = ""
;        int guess = 0;
        boolean Gdone = false;
        boolean done = false;
        do {
            int val = rng.nextInt(10) + 1; // generates random val
            do {
                System.out.print("Enter a number [1-10]: ");
                if (in.hasNextInt()) {
                    guess = in.nextInt();
                    in.nextLine();
                    if (guess >= 1 && guess <= 10) {
                        Gdone = true;
                    }
                } else {
                    trash = in.nextLine();
                }
            } while (!Gdone);
            System.out.println("The Lucky value was: " + val);
            if (val == guess) {
                System.out.println("You were right on the money! ");
            } else if (guess < val) {
                System.out.println("Your guess was low :( ");
            } else {
                System.out.println("Your guess was too high :( ");
            }
            System.out.print("Guess again? [Y/N]: ");
            if(in.hasNextLine())
            {
                continueYN = in.nextLine();
                if (continueYN.equalsIgnoreCase("N")) {
                    done = true;
                }
            }
        }while(!done);
    }
}
