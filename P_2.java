/*The body mass index (BMI) is commonly used by health and nutrition professionals 
 * to estimate human body fat in populations. It is computed by taking the individual's 
 * weight (mass) in kilograms and dividing it by the square of their height in meters. */
import java.util.Scanner;

public class P_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter person Weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter height of person in meter: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal Weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.println("The person is " + category + ".");
    }
}