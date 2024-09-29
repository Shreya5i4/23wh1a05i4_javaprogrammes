/*9. (a)Write a java program to check whether entered number is palindrome number or not.
Sample : input = 363, output = palindrome*/
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number; 
        int reversedNumber = 0;      

        while (number > 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }
        return originalNumber == reversedNumber;
    }
}
