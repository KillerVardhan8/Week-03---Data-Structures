import java.io.*;

public class ReadUserInputandWrite {
    public static void main(String[] args) {
        String binaryFilePath = "src/example.bin";
        String textFilePath = "src/example1.txt";

        try (
                FileInputStream fis = new FileInputStream(binaryFilePath);
                InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr); //
                FileWriter fw = new FileWriter(textFilePath, true);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            System.out.println("Reading binary file and writing to text file...");
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Binary file content successfully written to: " + textFilePath);
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}