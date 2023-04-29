/*Write a java program to print M-by-N array in the tabular format.
 * Also, display the sum of elements of the array.*/
import java.util.Scanner;

public class P_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of Rows of 2D-Array: ");
        int m = sc.nextInt();
        System.out.print("Enter number of Columns of 2D-Array: ");
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        System.out.println("Enter elements of 2D-Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Display the array in tabular format
        System.out.println("The elements of 2D array are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // Calculate the sum of the elements
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of elements of the 2D-Array is " + sum);
        
        sc.close();
    }
}