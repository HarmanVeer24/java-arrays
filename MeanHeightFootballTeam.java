import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define an array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;
        
        // Get input from the user
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        
        // Calculate the mean height
        double mean = sum / 11;
        
        // Display the result
        System.out.println("\nThe mean height of the football team is: " + mean + " meters");

    }
}