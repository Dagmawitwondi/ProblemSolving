public class SumDivisibleByC {

    // Method to calculate the sum of numbers divisible by c in the range [a, b]
    public static int sumDivisibleByC(int a, int b, int c) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        int a = 1, b = 10, c = 2;
        System.out.println("The sum of numbers divisible by " + c +
                " in the range [" + a + ", " + b + "] is: " +
                sumDivisibleByC(a, b, c));
    }
}
