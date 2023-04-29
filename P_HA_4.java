/*Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements. */

import java.util.Scanner;

public class P_HA_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get dimensions of matrices from user
        System.out.print("Enter the number of rows and columns of the matrices: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        
        // Create matrices
        double[][] matrix1 = new double[rows][cols];
        double[][] matrix2 = new double[rows][cols];
        
        // Get values of matrices from user
        System.out.println("Enter the values of matrix1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        
        System.out.println("Enter the values of matrix2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        
        // Add matrices
        double[][] sum = addMatrix(matrix1, matrix2);
        
        // Print result
        System.out.println("The sum of the matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
    
    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] sum = new double[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return sum;
    }
}