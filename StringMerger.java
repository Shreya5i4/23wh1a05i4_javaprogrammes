/*10. (a)Given two strings s1 and s2, your task is to merge those strings to form a new merged
string*/
import java.util.Scanner;

public class StringMerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string (s1): ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string (s2): ");
        String s2 = scanner.nextLine();

        String mergedString = mergeStrings(s1, s2);

        System.out.println("Merged String: " + mergedString);

        scanner.close();
    }

    public static String mergeStrings(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int length1 = s1.length();
        int length2 = s2.length();
        int maxLength = Math.max(length1, length2);

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                merged.append(s1.charAt(i)); 
            }
            if (i < length2) {
                merged.append(s2.charAt(i)); 
            }
        }

        return merged.toString(); 
    }
}
