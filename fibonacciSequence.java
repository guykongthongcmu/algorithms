import java.util.Scanner;
import java.util.Vector;

public class fibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number you want to input?: ");
        int userInput = input.nextInt();
        System.out.println("The result of number " + userInput + " in the fibbonaci sequence is " + fibbo(userInput));

        Vector<Integer> myVector = new Vector<Integer>(userInput);
        for (int i = 0; i < userInput + 1; i++) {
            myVector.add(fibbo(i));
        }

        System.out.println("The list of the numbers in the fibbonaci sequence from 0 to " + userInput + " is " + myVector);
    }

    public static int fibbo(int target) {
        if (target <= 1) {
            return target;
        } else {
            return fibbo(target - 1) + fibbo(target - 2);
        }
    } 
}
