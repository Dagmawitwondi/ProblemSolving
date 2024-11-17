import java.util.Scanner;

public class StringLength {

    // Method to calculate the length of a string
    public static int calculateLength(String str) {
        int length = 0;
        // Loop through each character of the string
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calculate and print the length of the string
        System.out.println("The length of the string is: " + calculateLength(input));

        // Close the scanner
        scanner.close();
    }
}
