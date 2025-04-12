import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class FileReader_ReadAfile {
    public static void main(String[] args) {
        String filePath ="src/example.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
