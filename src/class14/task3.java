package class14;

public class task3 {
    public static void main(String[] args) {
        /*
        you have a string a="Is it Saturday?Is it raining? Do we have a Jva Class today?
        How would you find out how many sentences=ces are in the String?
         */

        String a="Is it Saturdsy?Is it raining? Do we have a Jva Class today?";
        String[] b = a.split("[?]");
        System.out.println(b.length);


    }
}