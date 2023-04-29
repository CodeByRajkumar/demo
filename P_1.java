/*Write a Java program that can take a positive integer greater than 2 as input 
 * and write out the number of times one must repeatedly divide this number by 2 
 * before getting a value less than 2.  */
import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer greater than 2: ");
        int n = scanner.nextInt();

        int count = 0;
        while (n >= 2) {
            n /= 2;
            count++;
        }

        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + count);
    }
}