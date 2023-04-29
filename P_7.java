/*Write a java program to find the maximum and minimum and how many times 
 *they both occur in an array of n elements. Find out the positions where 
 *the maximum first occurs and the minimum last occurs.*/
import java.util.Scanner;
public class P_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the numbers of the array:");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.print("The elements are: ");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+"  ");
		}
		int maxCount=1;
		int maxValue=array[0];
		int maxIndex=0;
		for(int i=1;i<size;i++) {
			if(array[i]>maxValue) {//for index 1 to end
				maxValue = array[i];
                maxCount = 1;
                maxIndex = i;
			}
			else if(array[i]==maxValue) {//for index 0
				maxCount++;
			}
		}
		int minCount=1;
		int minValue=array[0];
		int minIndex=0;
		for(int i=1;i<size;i++) {//for index 1 to end
			if(array[i]<minValue) {
				minValue = array[i];
				minCount = 1;
				minIndex = i;
			}
			else if(array[i]==minValue) {//for index 0
				minCount++;
			}
		}
		System.out.println();
		System.out.println("Maximum element of Array is " + maxValue + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + minValue + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + (maxIndex+1) + ".");
        System.out.println("Last occurrence of minimum element is at position " + (minIndex+1) + ".");
			 		
	}

}
