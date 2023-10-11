package Practicals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

//Built-in Exception Examples

//Arithmetic Exception Demo
class ArithmeticException_Demo {
    public void displayException() {
        try {
            int a = 30, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

//NullPointer Exception Demo
class NullPointer_Demo {
    public void displayException() {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

//StringIndexOutOfBound Exception Demo
class StringIndexOutOfBound_Demo {
    public void displayException() {
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

//FileNotFound Exception Demo
class File_notFound_Demo {
    public void displayException() {
        try {
            // Following file does not exist
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

//NumberFormat Exception Demo
class NumberFormat_Demo {
    public void displayException() {
        try {
            // "akki" is not a number
            int num = Integer.parseInt("akki");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}

//ArrayIndexOutOfBounds Exception Demo
class ArrayIndexOutOfBound_Demo {
    public void displayException() {
        try {
            int[] a = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

//IO Exception Demo
class IOException_Demo {
    public void displayException() {
        // Create a new scanner with the specified String
        // Object
        Scanner scan = new Scanner("Hello Geek!");
        // Print the line
        System.out.println("" + scan.nextLine());
        // Check if there is an IO exception
        System.out.println("Exception Output: " + scan.ioException());
        scan.close();
    }
}

public class Built_in_Exception_Demo {
    public static void main(String[] args) {
        ArithmeticException_Demo ae = new ArithmeticException_Demo();
        ae.displayException();
        System.out.println();

        NullPointer_Demo np = new NullPointer_Demo();
        np.displayException();
        System.out.println();

        StringIndexOutOfBound_Demo siob = new StringIndexOutOfBound_Demo();
        siob.displayException();
        System.out.println();

        File_notFound_Demo fnf = new File_notFound_Demo();
        fnf.displayException();
        System.out.println();

        NumberFormat_Demo nf = new NumberFormat_Demo();
        nf.displayException();
        System.out.println();

        ArrayIndexOutOfBound_Demo aiob = new ArrayIndexOutOfBound_Demo();
        aiob.displayException();
        System.out.println();

        IOException_Demo ioe = new IOException_Demo();
        ioe.displayException();
    }
}
