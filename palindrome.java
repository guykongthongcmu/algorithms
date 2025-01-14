import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String str) {
        String temp = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }

        if (temp.equals(str)) {
            ans = true;
        } 
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        boolean A = isPalindrome(userInput);
        if (A == true) {
            System.out.println("The word "  + userInput + " is a palindrome!");
        } else {
            System.out.println("The word " + userInput + " is not a palindrome!"); 
        }
    }
}