import java.util.Scanner;

public class Calculationh
{
	int num1;
	int num2;
	int num3;
	static int choice = 0;
	Scanner sc = new Scanner(System.in); // Class-level scanner variable

	// Menu to display options
	public void menu()
	{
		System.out.println("1 = Addition of two numbers");
		System.out.println("2 = Subtraction of two numbers");
		System.out.println("3 = Multiplication of two numbers");
		System.out.println("4 = Division of two numbers");
		System.out.println("5 = Exit");
	}

	// Method to take input for two numbers
	public void takeInput()
	{
		System.out.println("Enter the first number:");
		num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		num2 = sc.nextInt();
	}

	// Addition of two numbers
	public void addition()
	{
		takeInput();
		num3 = num1 + num2;
		System.out.println("Result: " + num3);
	}

	// Subtraction of two numbers
	public void subtraction()
	{
		takeInput();
		num3 = num1 - num2;
		System.out.println("Result: " + num3);
	}

	// Multiplication of two numbers
	public void multiplication()
	{
		takeInput();
		num3 = num1 * num2;
		System.out.println("Result: " + num3);
	}

	// Division of two numbers
	public void division()
	{
		takeInput();
		if (num2 == 0) {
			System.out.println("Error: Division by zero is not allowed.");
		} else {
			num3 = num1 / num2;
			System.out.println("Result: " + num3);
		}
	}

	// Main method to execute the program
	public static void main(String[] args)
	{
		int x = 1;
		Calculationh calc = new Calculationh();
		
		while (x == 1)
		{
			calc.menu();
			System.out.println("Enter Your Choice:");
			choice = calc.sc.nextInt();

			switch(choice)
			{
				case 1:
					calc.addition();
					break;
				case 2:
					calc.subtraction();
					break;
				case 3:
					calc.multiplication();
					break;
				case 4:
					calc.division();
					break;
				case 5:
					System.out.println("Exiting the program. Thank you!");
					x = 0; // Exit condition
					break;
				default:
					System.out.println("Invalid Choice. Please try again.");
			}
			
			if (x == 1) {
				System.out.println("Do you want to continue? (y=1/n=0)");
				x = calc.sc.nextInt();
			}
		}
		
		calc.sc.close(); // Close the scanner when the program ends
	}
}
