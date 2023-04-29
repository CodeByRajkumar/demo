/*Write a Java program that takes two arrays a and b of length n storing int values,
 *  and returns the dot product of a and b. That is, it returns an array c of length n 
 *  such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1. */

public class P_HA_3 {
    public static int[] dotProduct(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = dotProduct(a, b);

        // Print out the dot product array
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}