import java.rmi.*;
import java.util.Scanner;

public class MyClient {

    public static void main(String args[]) {
        try {
            // Lookup the remote object and cast it to Adder
            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/binay");

            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Ask the user for the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Ask the user for the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Call the remote method and print the result
            System.out.println("Result: " + stub.add(num1, num2));

            // Close the scanner
            scanner.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
