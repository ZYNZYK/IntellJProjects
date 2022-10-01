package class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {

        String str = "jdunhjnhgjdkjfJSIKDGJD#$%$^%5435645";
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("str =" + str);

        String sentence="Batch 14 is great!Batch 14 is excellent";
        String[] split = sentence.split("[!]");
        System.out.println("split = "+ Arrays.toString(split));

        String str2="Batch 14 is Great.Batch 14 is Great"; //replace the 1st great
        String replace = str2.replaceFirst("Great","Good");
        System.out.println(replace);


    }
        ;
    }

