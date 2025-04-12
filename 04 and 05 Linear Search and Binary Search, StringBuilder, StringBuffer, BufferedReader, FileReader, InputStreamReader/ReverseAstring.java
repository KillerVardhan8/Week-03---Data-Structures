import java.util.*;
public class ReverseAstring {
    public static void main(String[] args) {
        String a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String : ");
        a=input.nextLine();
        System.out.println("Actual String : "+a);
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        System.out.println("Reversed String : "+sb);
        input.close();

    }
}
