mport java.util.Scanner;
import java.util.Arrays;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        int number = sc.nextInt();
        
        int maxFactor = 10; // Initial array size
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                factors[index++] = i;
            }
        }
        
        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
