import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("");
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i]);
            System.out.print(" mississipi ");
        }
        System.out.println("");
        for (String s : strArray) {
            System.out.print(s);
            System.out.print(" tomato ");
        }

        // Strings and arrays are special
        // - Most not special
        String anotherString = "assign string directly";
        double[] doubleArray = new double[9];

        Scanner scanner = new Scanner();
        ArrayList myGreatPythonList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        
        // Formula for assigning value to ref types
        // [DataType] [varName] = new DataType(); <-- called a constructor
        }
    }
