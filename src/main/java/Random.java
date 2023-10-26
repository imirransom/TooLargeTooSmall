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

        /*I am starting a conditional to check whether the user guesses the answer correctly and
          If they are incorrect, it will keep them in an infinite loop until they guess correctly*/
        while (true){
            if (guess < ans) {
                System.out.println("Too small");
                continue;
            } else if (guess == ans) {
                System.out.println("That is the correct answer!");
                break;
            } else {
                System.out.println("Too large");
            }
        }


    }
}
