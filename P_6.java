/*Write a Java method, isOdd( ), that takes an int i and returns true
 *if and only if i is odd. Your method can't use the multiplication,
 *modulus, or division operators, The method signature is as follows */
import java.util.Scanner;

public class P_6 {
	public static boolean isOdd(int n) {
        if ((n & 1) == 1) {
            // bit-wise AND operator to check if the last bit is 1
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is odd: " + isOdd(num));
    }
}