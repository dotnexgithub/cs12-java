import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static  void main(String[] args) {

        int x = 45;
//        dayOne();
        System.out.println();
    /*
        int i = 0;
        while (i < 10) {
            System.out.print(i + 1);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name. ");
        String input = scanner.nextLine();

        while (input == "") {
            System.out.println("Please enter your name. ");
            input = scanner.nextLine(); // Not redeclaring
        }
        String input;
        do {
            System.out.println("Please enter your name. ");
            input = scanner.nextLine(); // Not redeclaring
        }
        while (input == "");

        switch(x) {
            case 1:
                System.out.println("1");
                break;
            case 45:
                System.out.println("secret menu");
                break;
            default:
                System.out.println("nunavut");
                break;


        }
         */

        // for loops
        for (int i = 6; i < 10000000; i = i * i + 1) {
            System.out.println(i);
        }
    }
    public static void dayOne() {
        // PRIMITIVES
        float f = 90.0f;
        long l = 91834723428934L;

        // Others
        boolean booltest = true;
        char c = 'v';
        System.out.println(f);
        System.out.println(l);
        System.out.println(booltest);
        System.out.println(c);

        // Reference types
        String greeting = "hello";

        // Arrays
        int[] intArray = {1, 2, 3}; // Array of ints
        float[] floatArray = new float[5]; // Initializes 5 floats in this array
        String[] strArray = new String[100]; // Initializes 100 strings in this array

        intArray[0] = 120;
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            System.out.print(" mississauga ");
        }
        System.out.println();
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i]);
            System.out.print(" mississipi ");
        }
        System.out.println();
        for (String s : strArray) {
            System.out.print(s);
            System.out.print(" tomato ");
        }

        // Strings and arrays are special
        // - Most not special
        String anotherString = "assign string directly";
        double[] doubleArray = new double[9];

        ArrayList myGreatPythonList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        
        // Formula for assigning value to ref types
        // [DataType] [varName] = new DataType(); <-- called a constructor
        }
    }
