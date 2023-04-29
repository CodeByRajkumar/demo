/*Write a method that sums all the numbers in the major diagonal in 
 an n * n matrix of double values using the following header:
public static double sumMajorDiagonal(double[][] m)

Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal.*/

import java.util.Scanner;
public class P_9 {
	
	public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
	//main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read a 4-by-4 matrix from the user
        System.out.println("Enter the elements of a 4-by-4 matrix row by row:");
        double[][] m = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        // Display the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5.1f ", m[i][j]);
            }
            System.out.println();
        }
        // Compute the sum of the major diagonal
        double sum = sumMajorDiagonal(m);
        // Display the sum
        System.out.printf("Sum of the elements in the major diagonal is %.1f\n", sum);
    }
}