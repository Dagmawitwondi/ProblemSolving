public class StringLength {

    public static int calculateLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        System.out.println("The length of the string is: " + calculateLength(input));
    }
}
