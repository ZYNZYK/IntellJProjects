package class24Encapsulations;

import java.util.ArrayList;

public class ArrayDemo1 {

    public static void main(String[] args) {
        ArrayList<String>colors =new ArrayList<>();
        colors.add("Red");
        colors.add("Violet");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // print all the elements
        System.out.println(colors);

        //how to get a specific element from this list
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));

        //how to get the size of the list
        System.out.println(colors.size());

        // getting all the elements through a simple loop
        for (int i=0; i<colors.size();i++){
            System.out.println(colors.get(i));
        }

        //enhanced for loop
        System.out.println("*************************");
        for (String color:colors){
            System.out.println(color);
        }
    }
}
