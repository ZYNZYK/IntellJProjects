package class14;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Task2 {

    public static void main (String[] args){
        String str="dhjshfhFHDFH1263#@#$^&67874";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str=" + str);
        System.out.println(str.length());
    }
}
