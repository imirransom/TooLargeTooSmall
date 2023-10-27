/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Random {

    public static void main(String[] args){
        //Added the scanner object so I can utilize user inputs
    Scanner scanner = new Scanner(System.in);
        //Added  an object to use the scanner method
        System.out.print("Enter you number ");
        int guess = scanner.nextInt();
        //This will be the max the random number will go up to
        int max = 50;
    //I am declaring the math random method to help produce random numbers. I am saving as the answer variable
        int ans = (int) Math.random() * max;
        int numberOfGuesses = 0;
        /*I am starting a conditional to check whether the user guesses the answer correctly and
          If they are incorrect, it will keep them in an infinite loop until they guess correctly*/
        while (true){
            //If user guess a number too small, then they will need to input another guess
            if (guess < ans) {
                System.out.println("Too small");
                //This will increment the amount of guesses the user puts in
                numberOfGuesses ++;
                continue;
            } else if (guess == ans) {
                //If user guesses correctly, then they will break out of the code
                System.out.println("That is the correct answer!");
                break;
            } else {
                //If user guess a number too big, then they will need to input another guess
                System.out.println("Too large");
                numberOfGuesses++;
                continue;
            }
        }

        System.out.println("Awesome! You guessed the correct number. The amount of guess you had were " + numberOfGuesses);
    }
}
