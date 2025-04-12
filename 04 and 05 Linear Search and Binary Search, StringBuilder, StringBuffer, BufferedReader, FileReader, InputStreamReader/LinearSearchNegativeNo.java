import java.util.*;

public class LinearSearchNegativeNo {
    public static void main(String[] args) {
        Integer[] array={1,2,-4,5,6,-10};
        for (int i:array){
            if (i<0){
                System.out.println("First Negative Number :"+i);
                break;
            }
        }
    }
}
