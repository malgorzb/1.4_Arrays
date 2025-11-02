import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] firstNames = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Taylor", "Anderson"};

        System.out.print("How many random names to generate? ");
        int count = scanner.nextInt();

        System.out.println("\nGenerated names:");
        for (int i = 0; i < count; i++) {
            String first = firstNames[random.nextInt(firstNames.length)];
            String last = lastNames[random.nextInt(lastNames.length)];
            System.out.println((i + 1) + ". " + first + " " + last);
        }
    }
}
