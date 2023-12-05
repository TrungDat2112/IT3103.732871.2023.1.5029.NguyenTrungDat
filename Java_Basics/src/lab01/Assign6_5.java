package lab01;
import java.util.Arrays;
import java.util.Scanner;
public class Assign6_5 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Choose whether to enter the array or use a constant array
	        System.out.println("Nguyen Trung Dat - 20215029. Choose option:");
	        System.out.println("1. Enter the array");
	        System.out.println("2. Use a constant array (for demonstration)");
	        int option = scanner.nextInt();

	        int[] array;

	        if (option == 1) {
	            // Input array from the user
	            array = getArrayFromUser();
	        } else if (option == 2) {
	            // Use a constant array for demonstration
	            array = new int[]{9, 4, 7, 2, 1, 8, 3, 6, 5};
	            System.out.println("Using a constant array for demonstration: " + Arrays.toString(array));
	        } else {
	            System.out.println("Invalid option. Please choose 1 or 2.");
	            return;
	        }

	        // Sort the array
	        Arrays.sort(array);
	        System.out.println("Sorted array: " + Arrays.toString(array));

	        // Calculate the sum of array elements
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        System.out.println("Sum of array elements: " + sum);

	        // Calculate the average value of array elements
	        double average = (double) sum / array.length;
	        System.out.println("Average value of array elements: " + average);
	    }

	    private static int[] getArrayFromUser() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nguyen Trung Dat - 20215029. Enter the number of elements in the array: ");
	        int length = scanner.nextInt();

	        int[] array = new int[length];

	        System.out.println("Nguyen Trung Dat - 20215029. Enter the elements of the array:");

	        for (int i = 0; i < length; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        System.out.println("Nguyen Trung Dat - 20215029. Entered array: " + Arrays.toString(array));

	        return array;
	    }
	}

