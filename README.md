# Java Assignment 003

**Instructions:**
1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

## Guess My Number Game

**Objective:**
Program a Guess My Number game where the user tries to guess a randomly generated number.

**Instructions:**
1. The definition of GuessStarter is in a file called GuessStarter.java, in the **src** directory.
2. Compile and run this program.
3. Modify the program to prompt the user; then use a Scanner to read a line of user input. Compile and test the program.
4. Read the user input as an integer and display the result. Again, compile and test.
5. Compute and display the difference between the user’s guess and the number that was generated.

**Guess My Number Game:**
- The game should start by printing "I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?"
- Prompt the user to type a number.
- Display the user's guess.
- Print "The number I was thinking of is:" followed by the randomly generated number.
- Calculate and display the difference between the user’s guess and the generated number.

**Random Number Generation:**
To choose a random number, you can use the Random class in java.util. Here’s how it works:
```java
import java.util.Random;

public class GuessStarter {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }
}
```

Like the Scanner class in this chapter, Random has to be imported before we can use it. And as with Scanner, we have to use the new operator to create a Random (number generator). Then we can use the method nextInt to generate a random number. In this example, the result of nextInt(100) will be between 0 and 99, including both. Adding 1 yields a number between 1 and 100, including both.

## Submission
Follow these steps for submission:
1. Create a Feature01 branch of your code if you haven't already.
2. Commit your working code to your local copy/Feature01 branch.
3. Push it to your Remote/origin branch (i.e., GitHub: Feature01 -> origin/Feature01).
4. Issue a Pull request to my instructor repo.
5. **Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.**