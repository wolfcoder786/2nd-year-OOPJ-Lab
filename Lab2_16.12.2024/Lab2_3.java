// Write a program to print the week day for the given day no. of 	the current month using switch case statement
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Lab2_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the current year and month
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();

        // Prompt the user to enter a day number
        System.out.print("Enter the day number of the current month: ");
        int day = scanner.nextInt();

        // Validate the input day number
        if (day < 1 || day > today.lengthOfMonth()) {
            System.out.println("Invalid day number. Please enter a number between 1 and " + today.lengthOfMonth());
        } else {
            // Get the day of the week for the given date
            LocalDate date = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            // Use a switch statement to print the day of the week
            switch (dayOfWeek) {
                case MONDAY:
                    System.out.println("The day of the week is Monday.");
                    break;
                case TUESDAY:
                    System.out.println("The day of the week is Tuesday.");
                    break;
                case WEDNESDAY:
                    System.out.println("The day of the week is Wednesday.");
                    break;
                case THURSDAY:
                    System.out.println("The day of the week is Thursday.");
                    break;
                case FRIDAY:
                    System.out.println("The day of the week is Friday.");
                    break;
                case SATURDAY:
                    System.out.println("The day of the week is Saturday.");
                    break;
                case SUNDAY:
                    System.out.println("The day of the week is Sunday.");
                    break;
                default:
                    System.out.println("Error: Unable to determine the day of the week.");
            }
        }

        scanner.close();
    }
}
