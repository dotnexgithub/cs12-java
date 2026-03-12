import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Calculator {

    // I had decided to take a look on methods
    public static float getValidFloat(Scanner scn, String prompt, String failPrompt) {
        System.out.print(prompt);

        while (!scn.hasNextFloat()) {
            scn.next(); // consume invalid input

            System.out.println(failPrompt);
            System.out.print(prompt);
        }
        return Float.parseFloat(scn.nextLine()); // Had to do this instead of .nextFloat() because of
        // https://medium.com/@kritishdhungel/java-scanner-trap-why-nextline-gets-skipped-after-nextint-and-how-to-fix-it-efd075304f22
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Declarations
        String sel;
        float ans = Float.NaN;
        float x, y;
        ArrayList<String> options = new ArrayList<>(Arrays.asList("1","2","3","4")); // I used arraylist as I did not
        // want to use ints with scanner and because ArrayList has the .contains() method
        // Initialized with help from https://stackoverflow.com/a/2761019

        while (true) {
            // Main menu
            System.out.println("Operations:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division \n");
            System.out.println((!Float.isNaN(ans)) ? "[ANS] " + ans : ""); // https://www.w3schools.com/java/java_conditions_shorthand.asp

            while (true) {
                System.out.print("Enter your option: ");
                sel = scn.nextLine();
                if (options.contains(sel)) break;
            };

            // Get terms
            x = getValidFloat(scn, "Enter first term: ", "Not a valid input.");

            while (true) {
                y = getValidFloat(scn, "Enter second term: ", "Not a valid input.");
                if (sel.equals("4") && y == 0) {
                    System.out.println("Cannot divide by 0.");
                    continue;
                }
                break;
            }

            // Used to determine what operations to do with terms
            switch(sel) {
                case "1": // Addition
                    ans = x + y;
                    break;

                case "2": // Subtraction
                    ans = x - y;
                    break;

                case "3": // Multiplication
                    ans = x * y;
                    break;

                case "4": // Division
                    ans = x / y;
                    break;

                default:
                    System.out.print("Try again.");
                    continue;
            }
            System.out.println("Result: " + ans);
            System.out.println("-----------");
        }
    }
}
