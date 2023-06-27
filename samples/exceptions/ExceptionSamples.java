package exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionSamples {
    public static void run() {

        int a = 15;
        int b = 0;

        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
    }
    private static int divide(int a, int b) {
        try {
            return a/ b;
        } catch (ArithmeticException c) {
            System.out.println("Cannot divide by 0");
            return 0;
        }
    }

    public void go () throws IOException {

        File file = new File("file.txt");

        FileWriter writer = new FileWriter(file);
        writer.write("Its only test");
    }
}
