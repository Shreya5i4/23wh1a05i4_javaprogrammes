 /*5. (a)Write a Java program to create a method that takes an integer as a parameter and throws
an exception if the number is odd.*/
// Custom exception class
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class EvenNumberChecker {
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
    
        int[] numbers = {2, 3, 4, 5, 6};

        for (int number : numbers) {
            try {
                checkEven(number);
            } catch (OddNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
