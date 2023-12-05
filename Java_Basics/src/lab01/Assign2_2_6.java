package lab01;
import java.util.Scanner;
public class Assign2_2_6 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose the type of equation to solve:");
	        System.out.println("1. First-degree equation with one variable");
	        System.out.println("2. System of first-degree equations with two variables");
	        System.out.println("3. Second-degree equation with one variable");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                solveLinearEquation();
	                break;
	            case 2:
	                solveLinearSystem();
	                break;
	            case 3:
	                solveQuadraticEquation();
	                break;
	            default:
	                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
	        }
	    }

	    private static void solveLinearEquation() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nguyen Trung Dat - 20215029. Enter the value of a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Nguyen Trung Dat - 20215029. Enter the value of b: ");
	        double b = scanner.nextDouble();

	        if (a != 0) {
	            double x = -b / a;
	            System.out.println("Solution: x = " + x);
	        } else {
	            System.out.println("Invalid input. 'a' cannot be zero for a linear equation.");
	        }
	    }

	    private static void solveLinearSystem() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter coefficients for the linear system:");
	        System.out.print("a11: ");
	        double a11 = scanner.nextDouble();

	        System.out.print("a12: ");
	        double a12 = scanner.nextDouble();

	        System.out.print("b1: ");
	        double b1 = scanner.nextDouble();

	        System.out.print("a21: ");
	        double a21 = scanner.nextDouble();

	        System.out.print("a22: ");
	        double a22 = scanner.nextDouble();

	        System.out.print("b2: ");
	        double b2 = scanner.nextDouble();

	        double D = a11 * a22 - a21 * a12;
	        double D1 = b1 * a22 - b2 * a12;
	        double D2 = a11 * b2 - a21 * b1;

	        if (D != 0) {
	            double x1 = D1 / D;
	            double x2 = D2 / D;
	            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
	        } else {
	            if (D1 == 0 && D2 == 0) {
	                System.out.println("Infinite solutions (infinitely many solutions).");
	            } else {
	                System.out.println("No solution.");
	            }
	        }
	    }

	    private static void solveQuadraticEquation() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nguyen Trung Dat - 20215029. Enter the value of a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Nguyen Trung Dat - 20215029. Enter the value of b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Nguyen Trung Dat - 20215029. 2Enter the value of c: ");
	        double c = scanner.nextDouble();

	        double discriminant = b * b - 4 * a * c;

	        if (a != 0) {
	            if (discriminant > 0) {
	                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	                System.out.println("Two distinct real roots: root1 = " + root1 + ", root2 = " + root2);
	            } else if (discriminant == 0) {
	                double root = -b / (2 * a);
	                System.out.println("One real root (double root): root = " + root);
	            } else {
	                System.out.println("No real roots.");
	            }
	        } else {
	            System.out.println("Invalid input. 'a' cannot be zero for a quadratic equation.");
	        }
	    }
	}

