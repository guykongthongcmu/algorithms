import java.util.Random;
import java.util.Vector;

class insertionSort {
    public static Vector<Integer> sorted(Vector<Integer> myVector) {
        for (int j = 1; j < 10; j++) {
            int key = myVector.elementAt(j);
            int i = j - 1;
            while ((i >= 0) && (key < myVector.elementAt(i))) {
                myVector.set(i + 1, myVector.elementAt(i));
                i -= 1;
            }
            myVector.set(i + 1, key);
        }
        return myVector;
    }

    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<Integer>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myVector.add(rand.nextInt(10));
        }
        System.out.println("Unsorted array: " + myVector);
        System.out.println("Sorted out array: " + sorted(myVector));
    }
}
