package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char currentChar = 'a'; // Start with 'a'

        // Loop through the alphabet from 'a' to 'z'
        while (currentChar <= 'z') {
            System.out.println(currentChar); // Print the current character followed by a new line
            currentChar++; // Move to the next character
        }
    }

    public static void main(String[] args) {
        AlphabetPrinter printer = new AlphabetPrinter();
        printer.printAlphabet();
    }
}
