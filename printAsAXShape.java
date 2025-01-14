import java.util.Scanner;

public class printAsAXShape {
    public static void main(String[] args) {
        //Input from user
        Scanner input = new Scanner(System.in);
        System.out.println("What is your starting number?: ");
        int col = input.nextInt();
        System.out.println("What is the ending number?: ");
        int backStopper = input.nextInt();
        System.out.println();

        int row, space, indent = 1;

        for (row = 0; row < ((backStopper/2)+1); row++) {
            for (int i = col; i <= backStopper; i++) {
                if ((i == col) || (i == backStopper)) {
                    System.out.printf("%3d", i);
                } else {
                    System.out.printf("%3s", "");
                }
            }
        col++;
        backStopper--;
        System.out.println();
        for (space = 0; space < indent; space++) {
            System.out.printf("%3s", "");
        }
        indent++;
        }

        for (row = 0; row < (backStopper - (backStopper/2)); row++) {
            for (int v = col; v <= backStopper; v++) {
                if ((v == col) || (v == backStopper)) {
                    System.out.printf("%3d", v);
                } else {
                    System.out.printf("%3s", "");
                }
            }
        col--;
        backStopper++;
        System.out.println();
        for (space = indent + 1; space > indent; space--) {
            System.out.printf("%3s", "");
        }
        indent--;
        }

    }
}

