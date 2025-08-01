 import java.util.Scanner;

public class ScannerEcample {
    public static void main(String[] args) {
        // Import the Scanner class
       

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        System.out.print("Enter a number: ");
        String name = scanner.nextLine();
        Integer number = scanner.nextInt();

        // Display the input back to the user
        System.out.println("Hello, " + name + "!");
        System.out.println("You entered the number: " + number);

        // Close the scanner
        scanner.close();
    }
}
