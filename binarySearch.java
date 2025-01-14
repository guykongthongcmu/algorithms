import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class binarySearch {
    public static void main(String[] arg) {
        Vector myVector = new Vector<Integer>(10);
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to search?: ");
        int userInput = input.nextInt();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myVector.add(rand.nextInt(10));
        }

        insertionSort sort = new insertionSort();
        System.out.println("Unsorted array: " + myVector);
        sort.sorted(myVector);
        System.out.println("Sorted array: " + myVector);
        search(myVector, userInput);
    }

    public static boolean search(Vector<Integer> Vector, int searchValue) {
        boolean found = false;
        int left, right, mid;
        mid = Vector.size() / 2;
        while (found == false) {
            right = 0;
            left = 0;
            if (Vector.elementAt(mid) > searchValue) {
                left = 0;
                right = mid;
                mid = (right / 2);
            } else if (Vector.elementAt(mid) < searchValue) {
                left = mid;
                right = Vector.size();
                mid = (right / 2);
            } else if (Vector.elementAt(mid) == searchValue) {
                found = true;
            }

            // showing that the array is getting split
            System.out.print("[");
            for (int i = left; i < right; i++) {
                System.out.printf("%3d" , Vector.elementAt(i));
            }
            System.out.print("]");
            System.out.println();

            for (int i = left; i < right; i++) {
                if (Vector.elementAt(i) == searchValue) {
                    found = true;
                    System.out.println("The " + searchValue + " is in the array at index " + i);
                }
            }
            if (found == false) {
                System.out.println("The " + searchValue + " is not in the array");
                break;
            }
        }
        return found;
    }

}
