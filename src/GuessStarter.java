import java.util.Random;
import java.util.Scanner;

/** Starter code for the "Guess My Number" exercise.*/
public class GuessStarter {

    public static void main(String[] args) {
        //Prompt the user
        System.out.print("Pick your number ");

        Scanner in = new Scanner(System.in);

        //Read the users input:
        int guess = in.nextInt();

        //Pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        // Display the result
        System.out.println("Your number was: " + guess);

        //The difference
        int difference = Math.abs(number - guess);
        System.out.println("The difference of your guess and the answer is: " + difference);

    }
}
