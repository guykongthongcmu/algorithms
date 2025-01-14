import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

// Virawit Kongthong 672115045 Workshop Linear Search

public class linear_search {
    public static boolean search(Vector<Integer> myVector, int givenValue) {
        boolean found = false;

        for (int i = 0; i < myVector.size(); i++) {
            if (myVector.elementAt(i) == (givenValue)) {
                found = true;
            } 
        } return found;
    }

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number you want to find in the array?");
        int userChoice = 0;
        userChoice = input.nextInt();
        Vector<Integer> myVector = new Vector<>(10);
        Random rand = new Random();
        for (int j = 0; j < 10; j++) {
            myVector.add(rand.nextInt(10));
        }

        boolean result = search(myVector, userChoice);
        
        if (result == true) {
            System.out.println("The number is in the array");
        } else {
            System.out.println("The number is not in the array");
        }
        display(myVector);
    }
    public static void display(Vector<Integer> myVector) {
        System.out.println("Here are the values: ");
        for (int i =0; i<myVector.size();i++) {
            System.out.printf("%3d" , myVector.get(i));
        }
    }

}
