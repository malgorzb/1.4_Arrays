import java.util.Scanner;

public class Task1 {
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

        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += numbers[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + (start + 1) + "-" + (end + 1));
    }
}
