package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prev = 0;
        int curr = 1;

        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(prev);
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
    }
}
