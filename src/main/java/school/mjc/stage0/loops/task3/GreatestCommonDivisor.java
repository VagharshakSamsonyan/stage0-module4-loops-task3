package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = calculateGCD(first, second);
        System.out.println(gcd);
    }

    private int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        GreatestCommonDivisor gcdCalculator = new GreatestCommonDivisor();
        gcdCalculator.printGCD(24, 36); // Example usage
    }
}
