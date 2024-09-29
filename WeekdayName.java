/*(b) Write a Java program that takes a number from the user and generates an integer
between 1 and 7. It displays the weekday name.*/
import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        String weekday;
        switch (dayNumber) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
            default:
                weekday = "Invalid number! Please enter a number between 1 and 7.";
        }

        System.out.println(weekday);

        scanner.close();
    }
}
