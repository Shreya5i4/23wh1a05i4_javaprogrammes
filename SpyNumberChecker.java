/*8. Write a Java program to check whether the given non-negative number is SPYNUMBER
or not. A SPYNUMBER is a number where the sum of its digits equals the product of its
digits. If the number is SPYNUMBER print true else print false.
Ex: 1124 is SPYNUMBER, because the sum of its digits(1+1+2+4) = 8 and the product of
its digits (1*1*2*4) = 8 is equal.*/
import java.util.Scanner;

public class SpyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative number: ");
        int number = scanner.nextInt();
        
        boolean isSpyNumber = isSpyNumber(number);
        
        System.out.println(isSpyNumber);
        
        scanner.close();
    }
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        
        while (number > 0) {
            int digit = number % 10; 
            sum += digit;             
            product *= digit;        
            number /= 10;             
        }
        
        return sum == product;
    }
}

 