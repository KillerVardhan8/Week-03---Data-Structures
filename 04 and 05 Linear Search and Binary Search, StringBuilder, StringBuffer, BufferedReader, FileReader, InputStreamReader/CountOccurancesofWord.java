import java.io.*;
import java.util.*;
public class CountOccurancesofWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String filename="src/example.txt";
        try (BufferedReader br=new BufferedReader(new FileReader(filename))){
            String line;
            int count=0;
            System.out.println("Enter the word to be searched : ");
            String word=input.nextLine();
            while ((line=br.readLine())!=null){
                String[] Words=line.split(" ");
                for (String s:Words){
                    if (s.equalsIgnoreCase(word)){
                        count++;
                    }
                }
            }
            System.out.println("Count of occurances of word "+word+" is : "+count);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
