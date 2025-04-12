import java.util.*;
public class ComparingStringBufferandStringbuilder {
    public static void main(String[] args) {
        final int count=1000000;
        double starttime,endtime;
        starttime=System.nanoTime();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<count;i++){
            sb.append("Hello");
        }
        endtime=System.nanoTime();
        System.out.println("Total time taken by StringBuilder is : "+(endtime-starttime));

        starttime=System.nanoTime();
        StringBuffer sbf=new StringBuffer();
        for (int i=0;i<count;i++){
            sbf.append("Hello");
        }
        endtime=System.nanoTime();
        System.out.println("Total time taken by StringBuffer is : "+(endtime-starttime));
    }
}
