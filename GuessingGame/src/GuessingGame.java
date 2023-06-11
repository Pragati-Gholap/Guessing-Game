import java.util.Scanner;
public class GuessingGame {
	
	public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100); // Generates a random number between 0 and 99
        boolean hasWon = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 0 and 99.");
        System.out.println("Let's see if you can guess it!");

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guesses left.");
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Game over! The number was: " + randomNumber);
        }

        scanner.close();
    }
}
            


