import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new sc(System.in);
        
        // Get user input
        int number = sc.nextInt();
        
        // Define table array to store multiplication results
        int[] table = new int[10];
        
        // fill the array with multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        
        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
