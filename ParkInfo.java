import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class ParkInfo {
    public static void main(String [] args) throws IOException {
        FileInputStream fileByteStream = null;                  // File input stream
        Scanner scnr = null;                                    // Scanner object
        String line;                                            // String data value from file

        // Open file:
        System.out.println("Opening file ParkPhotos.txt");      // Marker 1
        fileByteStream = new FileInputStream("ParkPhotos.txt"); // Initialize file input stream to a file
        scnr = new Scanner(fileByteStream);                     // Create scanner object

        // Read file content:
        System.out.println("Reading file content...");          // Marker 2

        while (scnr.hasNextLine()) {                            // Condition 1
            line = scnr.nextLine();                             // Initialize string content to variable

            if (line.contains("_photo.jpg")) {                  // Condition 2
                line = line.replace("_photo.jpg", "_info.txt"); // replace content
                System.out.println(line);                       // Output modified content
            }
        }

        System.out.println("Closing file...");                  // Marker 3

        // Close file:
        scnr.close();
    }
}