package class24Encapsulations;

import java.util.ArrayList;

public class ArrayListDemo5 {
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("Violet");
            colors.add("Blue");
            colors.add("Yellow");
            colors.add("Black");
            System.out.println(colors);
            colors.remove("Blue");
            System.out.println(colors); // delete by actual value
            System.out.println("***************************");
            colors.remove(2); // delete by index
            System.out.println(colors);

        }
    }