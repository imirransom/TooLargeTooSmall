/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Random {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        //declaring fields using to be used with random number
        //int num1 = 0;
        System.out.print("Enter you number ");
        int userNumber = scanner.nextLine();
        int num2 = 50;
    //I am declaring the math random method to help produce random numbers
        int ans = (int) Math.random() * num2;
        if (1 < ans) {
            System.out.println();
        }
    }
}
