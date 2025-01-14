import java.util.Scanner;
import java.util.Vector;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to input?: ");
        int userInput = input.nextInt();
        Vector<Integer> vector = new Vector(userInput);
        System.out.println(userInput + " factorial is " + fac(userInput));
        for (int i = 0; i < userInput + 1; i++) {
            vector.add(fac(i));
        }
        System.out.println("The list of factorials from 0 to " + userInput + " is " + vector);
    }

    public static int fac(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * fac(number - 1);
        }
    }
}
