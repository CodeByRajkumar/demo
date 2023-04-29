/*Write a java method to calculate the sum of digits of a given number 
 *until the number is a single digit. The method signature is as follows.
 *public static int sum_Of_Digits(int n)*/
import java.util.*;

public class P_5 {
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n>0 || sum>9) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			int rem = n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Sum of digits of "+num+" until the number is a single digit is "
		                    +sumOfDigits(num));
		}
}