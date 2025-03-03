import java.util.Scanner;

public class LargestDigitsBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[10]; // Array to store digits
        int index = 0, maxDigit = 10; // Index and max size of array

        // Extract digits and dynamically expand array if needed
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10; // Increase array size by 10
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = numbre % 10; // Store last digit
            number /= 10; // Remove last digit
        }

        int largest = 0, secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
