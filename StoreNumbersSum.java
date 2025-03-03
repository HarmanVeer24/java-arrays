import java.util.Scanner;

public class StoreNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define an array of size 10 and a variable to store the total sum
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        // Infinite loop to take user input till 10 or user enter 0 or less 
        while (true) {
            double input = sc.nextDouble();
            // Check if input is 0 or negative, or if the array is full
            if (input <= 0 || index == 10) {
                break;
            }
            
            // Store the input in the array and increment index
            numbers[index] = input;
            index++;
        }
        
        // Calculate the total sum and display numbers
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        
        // Display the total sum
        System.out.println("\nTotal sum: " + total);
    }
}
