// write a program to read a fileName from user---display content--

// FILE WRITER

package FileReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterdemo {
    public static void main(String[] args) {
        String fileName = "java.course";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("HELLO ITS SHRUIT HERE.");
            System.out.println("SUCCESSFULLY WRITTEN TO THE FILE ...");
        } catch (IOException exception) {
            System.out.printf("ERROR OCCURRED. %s", exception.getMessage());
        }
    }
}


// FILE READER

package FileReader;

import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

 class readFile {


    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NAME OF THE FILE");
        String fileName = input.next();

        try (FileReader reader = new FileReader (fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.println((char)read);
            }
        } catch (IOException exception) {
            System.out.printf("EXCEPTION OCCURRED: %s",exception.getMessage());
        }


    }
}
