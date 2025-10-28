import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.println("\nThe array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }
}
