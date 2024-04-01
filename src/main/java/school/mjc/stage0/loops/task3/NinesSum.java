package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        // Initialize sum to 0
        int sum = 0;

        // Start with the number "9"
        int number = 9;

        // Loop through each length up to lengthOfLastNumber
        for (int i = 0; i < lengthOfLastNumber; i++) {
        // Add the current number to the sum
            sum += number;

        // Multiply the current number by 10 and add 9 to it
            number = number * 10 + 9;
        }
        // Print the sum
        System.out.println(sum);
    }
}
