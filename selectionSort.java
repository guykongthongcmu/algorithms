import java.util.Random;
import java.util.Vector;

public class selectionSort {
    public static void main(String[] args) {
        System.out.println("The sorted out array is: " + sort());
    }

    public static Vector<Integer> sort() {
        Vector<Integer> Vector = new Vector<Integer>(10);

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Vector.add(rand.nextInt(10));
        }
        System.out.println("The unsorted array is: " + Vector);
        int minIndex = 0;
        for (int i = 0; i < Vector.size() - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < Vector.size(); j++) {
                if (Vector.elementAt(j) < Vector.elementAt(minIndex)) {
                    minIndex = j;
                } 
            }
            if (minIndex != i) {
                int temp = Vector.elementAt(i);
                Vector.set(i, Vector.elementAt(minIndex));
                Vector.set(minIndex, temp);
            }
        }
        return Vector;
    }
}
