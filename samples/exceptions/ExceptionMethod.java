package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionMethod {

    public static void main(String[] args) {
        try {
            run();
        } catch (ExceptionFileNotExist e) {
            System.out.println(e.getMessage());
        }
    }

    private static void run() throws ExceptionFileNotExist {
        File file = new File("file.txt");
        if (file.exists()) {
            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
            } catch (ExceptionFileNotExist | FileNotFoundException e) {
                throw new ExceptionFileNotExist("File does not exist");
            }
            System.out.println(scanner.nextLine());
        } else {
            throw new ExceptionFileNotExist("File does not exist");
        }
    }
}
