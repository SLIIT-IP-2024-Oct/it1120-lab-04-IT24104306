import java.util.Scanner;
public class IT24104306Lab4Q3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input a number from the keyboard
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Determine the result using the ternary operator
        String result = number > 0 
                        ? "Positive" 
                        : (number < 0 ? "Negative" : "Zero");

        // Display the result
        System.out.println("The number is: " + result);

        // Close the scanner
        scanner.close();
    }
}