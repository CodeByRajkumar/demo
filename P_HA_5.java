/*Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix,
 *  prints the matrix, and finds the first row and column with the most 1s.
 */
public class P_HA_5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        // Fill matrix with random 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        // Print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Find row and column with most 1s
        int maxRow = 0;
        int maxCol = 0;
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum > maxCount) {
                maxCount = rowSum;
                maxRow = i;
            }
            if (colSum > maxCount) {
                maxCount = colSum;
                maxCol = i;
            }
        }

        // Print row and column with most 1s
        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }
}