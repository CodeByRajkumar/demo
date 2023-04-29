/*Write a Java program that takes all the lines input to standard input and 
 * writes them to standard output in reverse order. That is, each line is 
 * output in the correct order, but the ordering of the lines is reversed. */

import java.util.Scanner;
public class P_HA_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store the lines
        String[] lines = new String[100]; // Assume at most 100 lines
        int numLines = 0;
        // Read input from standard input and store each line in the array
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            lines[numLines] = line;
            numLines++;
        }
        // Print out the lines in reverse order
        for (int i = numLines - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
        scanner.close();
    }
}