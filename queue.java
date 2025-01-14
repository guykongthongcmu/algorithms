import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        System.out.println("How big do you want the queue to be?: ");
        int queueSize = input.nextInt();

        myQueue newQueue = new myQueue(queueSize);

        while (userInput != 5) {
            System.out.println();
            System.out.println("What would you like to do to the queue?\n\n 1. Enqueue\n 2. Dequeue\n 3. Check Size\n 4. Print Queue\n 5. Exit Program");
            System.out.println();
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("What would you like to enqueue into the queue");
                    int enqueueItem = input.nextInt();
                    newQueue.enqueue(enqueueItem);
                    System.out.println("Item " + enqueueItem + " has been enqueued into the queue!");
                    System.out.println("The queue now looks like this!\n" + newQueue.printQueue());
                    break;
                case 2:
                    System.out.println("Item " + newQueue.dequeue() + " has been dequeued from the queue!");
                    System.out.println("The queue now looks like this!\n" + newQueue.printQueue());
                    break;
                case 3:
                    System.out.println("The current size of the queue is " + newQueue.size());
                    break;
                case 4:
                    System.out.println("The queue currently looks like this " + newQueue.printQueue());
                    break;
                case 5:
                    System.out.println("Thanks for using the program!");
                    break;
                default:
                    System.out.println("Please choose a valid option! Ranging from 1 - 5");
                    break;
            }
        }

    }
}

class myQueue {
    private static int[] queueArray;
    private static int frontPointer;
    private static int endPointer;
    private static int size;

    public myQueue(int size){
        this.size = size;
        queueArray = new int[size];
        frontPointer = -1;
        endPointer = -1;
        
    }

    public static void enqueue(int input) {
        if (endPointer == size - 1) {
            System.out.println("Queue is full!");
        } else {
            queueArray[++endPointer] = input;
        }
    }

    public int dequeue() {
        if (isEmpty() == true) {
            System.out.println("Queue is empty cannot dequeue any elements");
            return -1;
        } else {
            int elementDequeue = 0;
            elementDequeue = queueArray[frontPointer + 1];
            queueArray[++frontPointer] = 0;
            return elementDequeue;
        }
    }

    public static boolean isEmpty() {
        if (frontPointer == endPointer) {
            endPointer = -1;
            frontPointer = -1;
            return true; 
        } else {
            return false;
        }
    }

    public static int size() {
        return endPointer + 1;
    }

    public static String printQueue() {
        String queue = "";
        for (int i = 0; i < size; i++) {
            queue = queue + " " + queueArray[i];
        }
        return queue;
    }
}

