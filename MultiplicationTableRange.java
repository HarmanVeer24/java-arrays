import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        int number = sc.nextInt();
        
        // Define an array to store multiplication results
        int[] multiplicationResult = new int[4];
        
        // Populate the array with multiplication results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        
        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}