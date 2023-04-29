/*Write a Java program that takes as input three integers, a, b, and c, from 
 * the Java console and determines if they can be used in a correct 
 * arithmetic formula (in the given order), like “a + b = c,” “a = b − c,” or “a b = c.”∗ */
import java.util.Scanner;

public class P_HA_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } else if (a == b - c) {
            System.out.println(a + " = " + b + " - " + c);
        } else if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
        } else {
            System.out.println("The input integers cannot form a correct arithmetic formula.");
        }
    }
}