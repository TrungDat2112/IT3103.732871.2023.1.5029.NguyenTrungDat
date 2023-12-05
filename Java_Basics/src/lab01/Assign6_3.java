package lab01;
import java.util.Scanner;
public class Assign6_3 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the height of the triangle
	        System.out.print("Nguyen Trung Dat - 20215029. 4Enter the height of the triangle (n): ");
	        int n = scanner.nextInt();

	        // Display the triangle
	        for (int i = 1; i <= n; i++) {
	            // Print spaces before the stars
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}

