import java.util.Scanner;

public class Copy2DTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        // Create and fill the 2D array
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Create a 1D array to store elements
        int[] array = new int[rows * cols];
        int index = 0;
        
        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
        // Display the 1D array
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
