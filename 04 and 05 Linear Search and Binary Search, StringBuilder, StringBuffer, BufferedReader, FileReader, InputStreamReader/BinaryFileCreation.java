import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileCreation {
    public static void main(String[] args) {
        String binaryFilename = "src/example.bin";
        byte[] binaryData = {65, 66, 67, 68, 69};

        try (FileOutputStream fos = new FileOutputStream(binaryFilename)) {
            fos.write(binaryData);
            System.out.println("Binary file created successfully at: " + binaryFilename);
        } catch (IOException e) {
            System.out.println("Error writing binary file: " + e.getMessage());
        }
    }
}