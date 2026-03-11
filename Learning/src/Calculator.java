import java.util.Scanner;
import java.util.Arrays;

public class Calculator {
    static float getValidFloat(Scanner scn, String prompt, String failPrompt) {
        System.out.print(prompt);

        while (!scn.hasNextFloat()) {
            scn.next(); // consume invalid input

            System.out.println(failPrompt);
            System.out.print(prompt);
        }
        return scn.nextFloat();
    }

    static int getValidInt(Scanner scn, String prompt, String failPrompt) {
        System.out.print(prompt);

        while (!scn.hasNextInt()) {
            scn.next(); // consume invalid input

            System.out.println(failPrompt);
            System.out.print(prompt);
        }
        return scn.nextInt();
    }

    static void main(String[] args) {
        // Write calculator program
        Scanner scn = new Scanner(System.in);
//        String text = scn.nextLine(); // gets user str
//        int number = scn.nextInt(); // gets user int
//        float floatNum = scn.nextFloat();

        // Declarations
        int sel;
        float ans = -1; // prevent possible compilation issues
        boolean showAns = false;

        float x, y; // declare terms used in math operations
        int[] options = {0, 1, 2, 3, 4};
        String failPrompt = "Try again.";
        while (true) {
            // Main menu
            System.out.println("Operations:");
            System.out.println("0 - Quit");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division \n");
            System.out.println((showAns) ? "[ANS] " + ans : "");
            if (!showAns) showAns = true;


            do {
                sel = getValidInt(scn, "Write the operation here: ", failPrompt);
                if (Arrays.binarySearch(options, sel) < 0) {
                    System.out.println(failPrompt); // hacky workaround but works for now
                    }
                }
                while(Arrays.binarySearch(options, sel) < 0);

            switch(sel) {
                case 0:
                    System.exit(0);

                case 1: // Addition
                    x = getValidFloat(scn, "Enter first term: ", failPrompt);
                    y = getValidFloat(scn, "Enter second term: ", failPrompt);
                    ans = x + y;
                    System.out.println("Result: " + ans);
                    break;

                case 2: // Subtraction
                    x = getValidFloat(scn, "Enter first term: ", failPrompt);
                    y = getValidFloat(scn, "Enter second term: ", failPrompt);
                    ans = x - y;
                    System.out.println("Result: " + ans);
                    break;

                case 3: // Multiplication
                    x = getValidFloat(scn, "Enter first term: ", failPrompt);
                    y = getValidFloat(scn, "Enter second term: ", failPrompt);
                    ans = x * y;
                    System.out.println("Result: " + ans);
                    break;

                case 4: // Division
                    x = getValidFloat(scn, "Enter dividend: ", failPrompt);
                    do {
                        y = getValidFloat(scn, "Enter divisor: ", failPrompt);
                        if (y == 0) {
                            System.out.println("Divisor cannot be zero.");
                        }
                    } while (y == 0); // ugly but works
                    ans = x / y;
                    System.out.println("Result: " + ans);
                    break;

                default:
                    System.out.print("default");
                    break;
            }
        }
    }
}
