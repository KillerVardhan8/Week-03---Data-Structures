import java.util.*;

public class RemoveDuplicatesStringBuilder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        HashSet<Character> hashSet=new HashSet<>();
        System.out.println("Enter a String : ");
        String sentence= input.nextLine();
        for (int i=0;i<sentence.length();i++){
            if (hashSet.contains(sentence.charAt(i))){
                continue;
            }
            else{
                hashSet.add(sentence.charAt(i));
                sb.append(sentence.charAt(i));
            }
        }
        System.out.println("String :"+sentence);
        System.out.println("String without duplicates : "+sb);


    }
}
