package lab01;
import java.util.Scanner;
public class Assign6_6 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Choose whether to enter matrices from the user or use constants
	        System.out.println("Nguyen Trung Dat - 20215029. Choose option:");
	        System.out.println("1. Enter matrices from the user");
	        System.out.println("2. Use constant matrices (for demonstration)");
	        int option = scanner.nextInt();

	        int[][] matrix1;
	        int[][] matrix2;

	        if (option == 1) {
	            // Input matrices from the user
	            matrix1 = getMatrixFromUser("first");
	            matrix2 = getMatrixFromUser("second");
	        } else if (option == 2) {
	            // Use constant matrices for demonstration
	            matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	            matrix2 = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
	            System.out.println("Using constant matrices for demonstration:");
	            printMatrix("first", matrix1);
	            printMatrix("second", matrix2);
	        } else {
	            System.out.println("Invalid option. Please choose 1 or 2.");
	            return;
	        }

	        // Check if matrices are of the same size
	        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
	            System.out.println("Matrices are not of the same size. Addition is not possible.");
	            return;
	        }

	        // Add the matrices
	        int[][] resultMatrix = addMatrices(matrix1, matrix2);

	        // Print the result matrix
	        System.out.println("Result of matrix addition:");
	        printMatrix("result", resultMatrix);
	    }

	    private static int[][] getMatrixFromUser(String matrixName) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the dimensions of the " + matrixName + " matrix:");
	        System.out.print("Number of rows: ");
	        int rows = scanner.nextInt();

	        System.out.print("Number of columns: ");
	        int columns = scanner.nextInt();

	        int[][] matrix = new int[rows][columns];

	        System.out.println("Enter the elements of the " + matrixName + " matrix:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Element at position (" + (i + 1) + ", " + (j + 1) + "): ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Entered " + matrixName + " matrix:");
	        printMatrix(matrixName, matrix);

	        return matrix;
	    }

	    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int columns = matrix1[0].length;

	        int[][] resultMatrix = new int[rows][columns];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        return resultMatrix;
	    }

	    private static void printMatrix(String matrixName, int[][] matrix) {
	        int rows = matrix.length;
	        int columns = matrix[0].length;

	        System.out.println(matrixName + " matrix:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

