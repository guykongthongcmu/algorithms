import java.util.Random;
import java.util.Vector;

public class quickSort {
    public static void sort(Vector<Integer> vector, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(vector, low, high);

            //sorting sub arrays after paritioning has been done
            sort(vector, low, pivotIndex - 1);
            sort(vector, pivotIndex + 1, high);
        }
    }

    public static int partition(Vector<Integer> vector, int low, int high) {
        int pivot = vector.elementAt(high);
        int i = (low - 1);

        //swapping numbers < pivot to the left of the pivot
        for (int j = low; j < high; j++) {
            if (vector.elementAt(j) <= pivot) {
                i++;
                int temp = vector.elementAt(i);
                vector.set(i, vector.elementAt(j));
                vector.set(j, temp);
            }
        }

        //setting pivot to in correct position
        int temp = vector.elementAt(i + 1);
        vector.set(i + 1, vector.elementAt(high));
        vector.set(high, temp);
        return i + 1;
    }

    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<Integer>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myVector.add(rand.nextInt(10));
        }
        System.out.println("The unsorted array is: " + myVector);
        sort(myVector, 0, 9);
        System.out.println("The sorted array is: " + myVector);
    }
}
