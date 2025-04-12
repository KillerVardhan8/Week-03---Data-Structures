import java.lang.reflect.Array;

public class ConcatenateStringBuffer {
    public static void main(String[] args) {
        String[] words={"Hello","Hi","How","Are","You"};
        StringBuffer sb=new StringBuffer();
        for (String s:words){
            sb.append(s);
        }
        System.out.println("Concatenated String : "+sb);
    }
}
