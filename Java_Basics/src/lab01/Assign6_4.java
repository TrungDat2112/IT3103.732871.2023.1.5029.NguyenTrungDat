package lab01;
import java.util.Scanner;
public class Assign6_4 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get month input from the user
	        String monthInput;
	        int monthNumber = 0;

	        do {
	            System.out.print("Nguyen Trung Dat - 20215029.Enter the month (full name, abbreviation, in 3 letters, or in number): ");
	            monthInput = scanner.nextLine().toLowerCase();

	            // Map month input to its corresponding number
	            switch (monthInput) {
	                case "january":
	                case "jan.":
	                case "jan":
	                case "1":
	                    monthNumber = 1;
	                    break;
	                case "february":
	                case "feb.":
	                case "feb":
	                case "2":
	                    monthNumber = 2;
	                    break;
	                case "march":
	                case "mar.":
	                case "mar":
	                case "3":
	                    monthNumber = 3;
	                    break;
	                case "april":
	                case "apr.":
	                case "apr":
	                case "4":
	                    monthNumber = 4;
	                    break;
	                case "may":
	                case "5":
	                    monthNumber = 5;
	                    break;
	                case "june":
	                case "jun.":
	                case "jun":
	                case "6":
	                    monthNumber = 6;
	                    break;
	                case "july":
	                case "jul.":
	                case "jul":
	                case "7":
	                    monthNumber = 7;
	                    break;
	                case "august":
	                case "aug.":
	                case "aug":
	                case "8":
	                    monthNumber = 8;
	                    break;
	                case "september":
	                case "sep.":
	                case "sep":
	                case "9":
	                    monthNumber = 9;
	                    break;
	                case "october":
	                case "oct.":
	                case "oct":
	                case "10":
	                    monthNumber = 10;
	                    break;
	                case "november":
	                case "nov.":
	                case "nov":
	                case "11":
	                    monthNumber = 11;
	                    break;
	                case "december":
	                case "dec.":
	                case "dec":
	                case "12":
	                    monthNumber = 12;
	                    break;
	                default:
	                    System.out.println("Invalid month input. Please enter a valid month.");
	            }
	        } while (monthNumber == 0);

	        // Get year input from the user
	        int year;
	        do {
	            System.out.print("Nguyen Trung Dat - 20215029. Enter the year (non-negative, all digits): ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Invalid input. Please enter a valid year.");
	                scanner.next(); // Consume the invalid input
	            }
	            year = scanner.nextInt();

	            if (year < 0 || year < 1000) {
	                System.out.println("Invalid year input. Please enter a non-negative year with all digits.");
	            }
	        } while (year < 0 || year < 1000);

	        // Check if it's a leap year
	        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	        // Calculate and display the number of days in the specified month for the given year
	        int daysInMonth;
	        switch (monthNumber) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                daysInMonth = 31;
	                break;
	            case 4: case 6: case 9: case 11:
	                daysInMonth = 30;
	                break;
	            case 2:
	                daysInMonth = isLeapYear ? 29 : 28;
	                break;
	            default:
	                daysInMonth = 0; // Invalid month
	        }

	        if (daysInMonth > 0) {
	            System.out.println("Number of days in " + monthNumber + " " + year + ": " + daysInMonth + " days.");
	        } else {
	            System.out.println("Invalid month input. Please enter a valid month.");
	        }
	    }
	}

