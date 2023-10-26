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
        int userNumber = scanner.nextInt();
        //This will be the max the random number will go up to
        int max = 50;
    //I am declaring the math random method to help produce random numbers
        int ans = (int) Math.random() * max;

        //I am starting a conditional
        while (true){
            if (userNumber < ans) {
                System.out.println("Too Small");
                continue;
            } else {
                System.out.println("Too Large");
                continue;
            }
        }


    }
}
