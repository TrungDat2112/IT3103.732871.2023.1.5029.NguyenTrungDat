package lab01;
import java.util.Scanner;
public class Assign2_2_5 {
	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);

	        // Input first number
	        System.out.print("Nguyen Trung Dat - 20215029. Enter the first number: ");
	        String strNum1 = scanner.nextLine();
	        double num1 = Double.parseDouble(strNum1);

	        // Input second number
	        System.out.print("Nguyen Trung Dat - 20215029.Enter the second number: ");
	        String strNum2 = scanner.nextLine();
	        double num2 = Double.parseDouble(strNum2);

	        // Calculate and display results
	        double sum = num1 + num2;
	        double difference = num1 - num2;
	        double product = num1 * num2;
	        
	        // Check divisor for division to prevent division by zero
	        double quotient;
	        if (num2 != 0) {
	            quotient = num1 / num2;
	            System.out.println("Quotient: " + quotient);
	        } else {
	            System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
	            return; // Exit the program
	        }

	        // Display results
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	    }
	}

