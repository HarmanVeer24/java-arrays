import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of names of three friends , there ages and heights
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3]; 

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }
        // Index of youngest friend and tallest friend
        int youngestIndex = 0; 
        int tallestIndex = 0; 

        // Finding the youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Displaying the results
        System.out.println("Youngest: " + friends[youngestIndex]);
        System.out.println("Tallest: " + friends[tallestIndex]);
    }
}
