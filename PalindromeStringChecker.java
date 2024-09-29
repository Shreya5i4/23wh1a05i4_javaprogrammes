/*(b) Write a java program to check whether the given string is palindrome or not ?*/
import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        
        String cleanedString = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }
}
