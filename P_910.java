/*Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column.*/
import java.util.Scanner;

public class P_910 {
   public static void main(String[] args) {
      // create scanner object to read input from console
      Scanner input = new Scanner(System.in);

      // declare and initialize the matrix
      double[][] matrix = new double[3][4];

      // prompt the user to enter values for the matrix
      System.out.print("Enter a 3-by-4 matrix row by row: ");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = input.nextDouble();
         }
      }

      // calculate the sum of each column and display the result
      for (int j = 0; j < matrix[0].length; j++) {
         double sum = sumColumn(matrix, j);
         System.out.printf("Sum of the elements at column %d is %.1f\n", j, sum);
      }
   }

   public static double sumColumn(double[][] m, int columnIndex) {
      double sum = 0;
      for (int i = 0; i < m.length; i++) {
         sum += m[i][columnIndex];
      }
      return sum;
   }
}