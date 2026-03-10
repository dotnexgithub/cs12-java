import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Write calculator program
        Scanner scn = new Scanner(System.in);
//        String text = scn.nextLine(); // gets user str
//        int number = scn.nextInt(); // gets user int
//        float floatNum = scn.nextFloat();

        // Main menu
        System.out.println("Operations:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        int sel;
        while (true) {
            System.out.print("Write the operation here: ");
            sel = scn.nextInt();
            break;
        }
    }
}
