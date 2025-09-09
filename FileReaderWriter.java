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


