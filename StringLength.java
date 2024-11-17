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
        // Example string
        String input = "Hello, world!";
        
        // Calculate and print the length of the string
        System.out.println("The length of the string is: " + calculateLength(input));
    }
}
