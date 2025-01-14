import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        Mystack stack = new Mystack(5);
        Scanner input = new Scanner(System.in);
        int userChoice = 0;
        
        while (userChoice != 5) {
            System.out.println();
            System.out.println("What would you like to do?\n 1. Push\n 2. Pop\n 3. Size\n 4. Print Stack\n 5. Exit");
            System.out.println();
            userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    int pushNum = 0;
                    System.out.println("What number would you like to push?: ");
                    pushNum = input.nextInt();
                    stack.push(pushNum);
                    System.out.println("Pushed number " + pushNum + " into the stack!" + stack.printStack());
                    break;
                case 2:
                    System.out.println("Popped number " + stack.pop());
                    System.out.println("The current stack looks like this!" + stack.printStack());
                    break;
                case 3:
                    System.out.println("The size of the stack is " + stack.size() + " elements");
                    break;
                case 4:
                    System.out.println("These are the current elements inside the stack!" + stack.printStack());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter a valid option ranging from 1 - 5");
            }
        }
    }
}

class Mystack{
    private static int[] stackArray;
    private static int top;
    private static int capacity; 
        
    //setter
    public Mystack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }
        
    public static void push(int element) {
        if (top == capacity - 1) {
        System.out.println("Stack overflow");
    } else {
        stackArray[++top] = element;
    }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static int size() {
            return top + 1;
        }
    
        public static String printStack(){
        String result = "";
        for (int i = 0; i < size(); i++) {
            result = result + " " + stackArray[i];
        }
        return "[" + result + "]";
    }

}