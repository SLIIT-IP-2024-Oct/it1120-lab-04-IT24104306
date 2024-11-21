import java.util.Scanner;

public class IT24104306Lab4Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validate exam marks
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        while (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
            System.out.print("Enter exam marks (out of 100): ");
            examMarks = scanner.nextDouble();
        }

        // Input and validate lab submission marks
        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        while (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
            System.out.print("Enter lab submission marks (out of 100): ");
            labMarks = scanner.nextDouble();
        }

        // Input and validate percentages for exam and lab
        System.out.print("Enter percentage weight for exam: ");
        double examPercentage = scanner.nextDouble();
        System.out.print("Enter percentage weight for lab submission: ");
        double labPercentage = scanner.nextDouble();

        while (examPercentage + labPercentage != 100) {
            System.out.println("Invalid input! Percentages should add up to 100.");
            System.out.print("Enter percentage weight for exam: ");
            examPercentage = scanner.nextDouble();
            System.out.print("Enter percentage weight for lab submission: ");
            labPercentage = scanner.nextDouble();
        }

        // Calculate final mark
        double finalMark = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));

        // Display the result
        System.out.println("Final mark for the module is: " + finalMark);

        // Close the scanner
        scanner.close();
    }
}