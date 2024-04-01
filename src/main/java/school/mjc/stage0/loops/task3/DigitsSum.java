package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        int n = Math.abs(number); // Get the absolute value of the number

        // Calculate the sum of digits
        while (n > 0) {
            sum += n % 10; // Add the last digit to the sum
            n /= 10; // Remove the last digit
        }

        // Print the sum followed by a newline character
        System.out.println(sum);
    }
}
