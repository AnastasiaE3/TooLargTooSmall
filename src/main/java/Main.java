import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        // generate a random number using Math. random()
        // run a loop; each time ask the user to enter an answer.
        // if right then break and "congrats loser you won"
        // else print "you're loser"
        int k = 4;
        int i, guesses;
        int randomNum = (int) (Math.random() * 101); // 0-100
        System.out.println("The game has started! You have 4 tries");


        for (i  = 0; i < k; i++) {

            Scanner scanner = new Scanner(System.in);
            int guessNum = scanner.nextInt();

            if (randomNum == guessNum) {
                System.out.println("Finally, you got this!");
                break;
            } else if (randomNum < guessNum) {
                System.out.println("The number is too big, try again");
            } else {
                System.out.println("The number is too small, try again!");
            }



        }
        System.out.println("No more tries for you loser");
    }

    }

