import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Variables to store sums
        int evenSum = 0, oddSum = 0;

        // Printing even, odd numbers and calculating their sums
        System.out.print("\nEven numbers: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                evenSum += num;
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                oddSum += num;
            }
        }

        // Printing sums
        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        scanner.close();
    }
}