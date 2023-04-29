//Write a java program to check whether a number is a spy number or not.
import java.util.Scanner;
public class P_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter any number:");
		int N = sc.nextInt(),originalN = N ;
		int sum=0,prod=1;
		while(N>0) {
			int rem=N%10;
			sum+=rem;
			prod*=rem;
			N/=10;
		}
		System.out.println("Sum of digit of N "+sum);
		System.out.println("Product of digit of N "+prod);
		if(sum==prod)
			System.out.println("So, "+originalN+" is a spy number.");
	}
}